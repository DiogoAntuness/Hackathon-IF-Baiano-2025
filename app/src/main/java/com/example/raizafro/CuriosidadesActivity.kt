package com.example.raizafro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.raizafro.databinding.ActivityCuriosidadesBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CuriosidadesActivity : AppCompatActivity() { // SEM FUNCIONALIDADE AINDA, APENAS EXISTINDO

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

        // FECHA SOZINHO APÓS 3s
        lifecycleScope.launch {
            delay(3000)
            finish()
        }
    }
}
