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
    private var answered = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        carregarPergunta()

        binding.btnSair.setOnClickListener { finishAffinity() }

        binding.btnSim.setOnClickListener { responder(0) }
        binding.btnNao.setOnClickListener { responder(1) }
    }

    private fun carregarPergunta() {
        answered = false

        val p = perguntas[index]
        binding.txtPergunta.text = p.text
    }

    private fun responder(opcao: Int) {
        if (answered) return
        answered = true

        val p = perguntas[index]

        if (opcao == p.correctIndex) score++

        abrirCuriosidade(p.curiosity)
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
