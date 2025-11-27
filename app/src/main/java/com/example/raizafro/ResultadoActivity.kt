package com.example.raizafro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityResultadoBinding
import com.example.raizafro.models.perguntas

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)
        val total = perguntas.size
        val percent = ((score.toDouble() / total.toDouble()) * 100).toInt()

        binding.tvScore.text = "Seu Índice de Vivência Afro:\n$percent%"

        val resumo = when (percent) {
            in 0..20 -> "Você pratica mais cultura afro-brasileira do que imagina, mesmo sem perceber!"
            in 21..50 -> "Boa parte do seu cotidiano tem raízes afro — mesmo quando isso passa despercebido."
            in 51..80 -> "A cultura afro-brasileira está fortemente presente no seu dia a dia!"
            else -> "Você vive intensamente práticas afro-brasileiras na sua rotina!"
        }

        binding.tvResumo.text = resumo

        binding.tvMensagemFinal.text =
            "A cultura afro-brasileira não é 'coisa dos outros'. Ela estrutura a forma como o Brasil fala, come, dança, celebra, acredita e vive.\n\n" +
                    "Seu cotidiano é afro — reconhecer isso é reconhecer a história que construiu o país."
    }
}
