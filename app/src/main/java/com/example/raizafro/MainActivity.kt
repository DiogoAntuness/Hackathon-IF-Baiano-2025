package com.example.raizafro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { // Tela inicial simples, apenas para abrir as outras telas

    private lateinit var binding: ActivityMainBinding // Uso de Binding, melhor que findViewById ;D

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnIniciarQuiz.setOnClickListener {
            val intent = (Intent(this, QuizActivity::class.java))
            startActivity(intent)
        }

        binding.btnCuriosidades.setOnClickListener {
            startActivity(Intent(this, CuriosidadesActivity::class.java))
        }

        binding.btnSobre.setOnClickListener {
            startActivity(Intent(this, CreditosActivity::class.java))
        }
    }
}
