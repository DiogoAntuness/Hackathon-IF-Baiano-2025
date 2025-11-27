package com.example.afroquiz

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.raizafro.databinding.ActivityCuriosidadesBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CuriosidadesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuriosidadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuriosidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // RECEBENDO A CURIOSIDADE
        val texto = intent.getStringExtra("curiosidade") ?: "Sem curiosidade disponível."
        binding.txtCuriosidade.text = texto

        // BOTÃO FECHAR
        binding.btnClose.setOnClickListener {
            finish()
        }

        // FECHA SOZINHO APÓS 2s (SEM HANDLER DEPRECIADO)
        lifecycleScope.launch {
            delay(2000)
            finish()
        }
    }
}
