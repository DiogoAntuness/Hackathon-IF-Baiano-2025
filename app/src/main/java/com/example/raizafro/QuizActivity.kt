package com.example.raizafro

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityQuizBinding

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding
    private val perguntas = PerguntasRepository.getPerguntas()
    private var index = 0
    private var pontos = 0
    private val maxPontos = perguntas.sumOf { it.pontos }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carregarPergunta()

        binding.btnSim.setOnClickListener {
            pontos += perguntas[index].pontos
            proximaPergunta()
        }

        binding.btnNao.setOnClickListener {
            proximaPergunta()
        }
    }

    private fun carregarPergunta() {
        val pergunta = perguntas[index]
        binding.txtPergunta.text = pergunta.texto

        // animação leve
        binding.cardPergunta.animate()
            .alpha(1f)
            .setDuration(300)
            .start()

        binding.progressBar.progress = index + 1
        binding.progressBar.max = perguntas.size
    }

    private fun proximaPergunta() {
        // animação de saída
        binding.cardPergunta.animate()
            .alpha(0f)
            .setDuration(200)
            .withEndAction {
                index++
                if (index < perguntas.size) {
                    carregarPergunta()
                } else {
                    finalizarQuiz()
                }
            }
            .start()
    }

    private fun finalizarQuiz() {
        val intent = Intent(this, ResultadoActivity::class.java)
        intent.putExtra("pontos", pontos)
        intent.putExtra("maxPontos", maxPontos)
        startActivity(intent)
        finish()
    }
}
