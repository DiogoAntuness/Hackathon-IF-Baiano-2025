package com.example.raizafro

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityResultadoBinding
import com.example.raizafro.models.perguntas

class ResultadoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Calcular a Pontuação
        val score = intent.getIntExtra("score", 0)
        val total = perguntas.size

        // Evita divisão por zero se a lista estiver vazia (segurança)
        val porcentagem = if (total > 0) ((score.toDouble() / total.toDouble()) * 100).toInt() else 0

        // 2. Exibir o percentual no topo
        binding.txtScore.text = "Seu Índice de Vivência Afro-Brasileira é $porcentagem%"

        // 3. Lógica para definir o texto e se exibe a mensagem final
        if (porcentagem == 0) {
            // CASO 0%: Texto específico e esconde a mensagem final
            binding.txtResumo.text = "Que tal começar a descobrir?\n\nA cultura afro-brasileira é a base do nosso país," +
                    " mas muitas vezes ela foi invisibilizada. Aproveite este momento para olhar ao redor com mais atenção: nas palavras, na comida e na música."

            // Esconde a mensagem final padrão
            binding.txtMensagemFinal.visibility = View.GONE

        } else {
            // CASO > 0%: Mostra a mensagem final e define o nível
            binding.txtMensagemFinal.visibility = View.VISIBLE

            val resumo = when (porcentagem) {
                in 1..30 -> "Você está começando a perceber as raízes.\n\nAinda há muito para descobrir, mas você já nota que o Brasil tem um ritmo e uma alma que vêm da África."
                in 31..60 -> "Você tem uma boa conexão!\n\nBoa parte do seu cotidiano tem raízes afro — mesmo quando isso passa despercebido, você vive essa cultura."
                in 61..79 -> "A cultura afro-brasileira é forte em você!\n\nSeu dia a dia respira essa herança. Talvez você não reconhece e valoriza as origens do que consome e fala."
                else -> "Você vive intensamente a cultura afro!\n\nSuas práticas, gostos e vivências são um reflexo vivo da história que construiu o país."
            }
            binding.txtResumo.text = resumo

            // Texto padrão para quem pontuou algo
            binding.txtMensagemFinal.text =
                "A cultura afro-brasileira não é 'coisa dos outros'. Ela estrutura a forma como o Brasil fala, come, dança, celebra, acredita e vive.\n\n" +
                        "Seu cotidiano é afro — reconhecer isso é reconhecer a história que construiu o país."
        }

    }
}