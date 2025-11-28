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
import com.example.raizafro.models.Pergunta   // Importa a estrutura de dados

class QuizActivity : AppCompatActivity() {

    private lateinit var perguntasEmbaralhadas: List<Pergunta>

    private lateinit var binding: ActivityQuizBinding

    private var index = 0
    private var score = 0
    private var respondida = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        perguntasEmbaralhadas = perguntas.shuffled()

        carregarPergunta()

        binding.btnSair.setOnClickListener { finish() }

        binding.btnSim.setOnClickListener { responder(0) }
        binding.btnNao.setOnClickListener { responder(1) }
    }

    private fun carregarPergunta() {
        respondida = false
        // Lógica da Barra de Progresso
        val totalPerguntas = perguntasEmbaralhadas.size
        val perguntaAtual = index + 1 // Como o index começa em 0, somamos 1
        val progresso = (perguntaAtual * 100) / totalPerguntas
        // Aplica na barra (com animação suave se possível, mas direto por enquanto)
        binding.progressBar.progress = progresso

        val p = perguntasEmbaralhadas[index] // p Pega as pergunta do Model: Pergunta.kt // shuffled() deixa aleatório as perguntas
        binding.txtPergunta.text = p.text  // Recebe o texto no xml.
    }

    private fun responder(opcao: Int) {
        if (respondida) return // Se a pergunta já foi respondida, a função para imediatamente.

        respondida = true  // Se ainda não, marca como respondida.

        val p = perguntasEmbaralhadas[index] // pega a pergunta atual.

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

        if (index < perguntasEmbaralhadas.size) {
            carregarPergunta()
        } else {
            val intent = Intent(this, ResultadoActivity::class.java)
            intent.putExtra("score", score)
            startActivity(intent)
            finish()
        }
    }
}
