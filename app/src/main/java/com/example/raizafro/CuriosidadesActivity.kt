package com.example.raizafro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityCuriosidadesBinding

class CuriosidadesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuriosidadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuriosidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupLink(binding.linkNeabi, "https://www.instagram.com/neabi.bonfim")

        // Botão voltar no topo da tela
        binding.btnVoltar.setOnClickListener {
            finish() // Fecha a tela e volta para o Menu
        }
    }

    private fun setupLink(textView: TextView, url: String) {
        textView.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}