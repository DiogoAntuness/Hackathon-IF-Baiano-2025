package com.example.raizafro

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityQuizBinding
import com.example.raizafro.databinding.PopupCuriosidadeBinding
import com.example.raizafro.models.perguntas

class QuizActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizBinding

    private var index = 0
    private var score = 0
    private var respondida = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carregarPergunta()

        binding.btnSair.setOnClickListener { finish() }

        binding.btnSim.setOnClickListener { responder(0) }
        binding.btnNao.setOnClickListener { responder(1) }
    }

    private fun carregarPergunta() {
        respondida = false

        val p = perguntas[index] // p Pega as pergunta do Model: Pergunta.kt
        binding.txtPergunta.text = p.text  // Recebe o texto no xml.
    }

    private fun responder(opcao: Int) {
        if (respondida) return // Se a pergunta já foi respondida, a função para imediatamente.

        respondida = true  // Se ainda não, marca como respondida.

        val p = perguntas[index] // pega a pergunta atual.

        if (opcao == p.correctIndex) score++ // se marcar 'sim' soma no score.

        abrirCuriosidade(p.curiosidade) // Abre a curiosidade independente da resposta.
    }

    private fun abrirCuriosidade(texto: String) {
        val dialog = Dialog(this)
        val popBinding = PopupCuriosidadeBinding.inflate(layoutInflater)

        dialog.setContentView(popBinding.root)
        dialog.setCancelable(false)

        popBinding.txtCuriosidade.text = texto

        popBinding.btnClose.setOnClickListener {
            dialog.dismiss()
            irParaProxima()
        }

        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }

    private fun irParaProxima() {
        index++

        if (index < perguntas.size) {
            carregarPergunta()
        } else {
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}
