package com.example.raizafro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.raizafro.databinding.ActivityCreditosBinding

class CreditosActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCreditosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreditosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configura o clique do botão Voltar
        binding.btnVoltar.setOnClickListener {
            finish() // Fecha a tela de créditos e volta para a anterior
        }
    }
}

