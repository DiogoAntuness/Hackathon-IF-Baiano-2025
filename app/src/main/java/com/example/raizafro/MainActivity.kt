package com.example.raizafro

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.raizafro.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

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
    }
}
