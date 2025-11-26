package com.example.raizafro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.data.CalculoIndice
import com.example.raizafro.databinding.ActivityResultadoBinding

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val pontos = intent.getIntExtra("pontos", 0)
        val max = intent.getIntExtra("maxPontos", 0)

        val indice = CalculoIndice.calcular(pontos, max)
        binding.txtResultado.text = "$indice%"

        binding.txtMensagem.text = when {
            indice >= 80 -> "Você vive intensamente a cultura afro-brasileira!"
            indice >= 50 -> "A cultura afro está presente em muito do seu dia a dia."
            else -> "Há muito sobre cultura afro-brasileira que você talvez ainda não conheça."
        }

        binding.btnCuriosidades.setOnClickListener {
            startActivity(Intent(this, CuriosidadesActivity::class.java))
        }
    }
}
