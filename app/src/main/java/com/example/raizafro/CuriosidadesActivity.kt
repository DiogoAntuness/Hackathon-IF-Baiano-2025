package com.example.raizafro

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityCuriosidadesBinding
import com.example.raizafro.databinding.ItemCardGaleriaBinding
import com.example.raizafro.databinding.ItemTituloSecaoBinding

class CuriosidadesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuriosidadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuriosidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVoltar.setOnClickListener { finish() }

        // --- MONTAGEM DA TELA ---

        // Seção 1: Institucional
        adicionarTitulo("✊🏿 NEABI")
        adicionarCard(
            titulo = "NEABI Campus SBF",
            descricao = "Núcleo de estudos afro-brasileiros e indígenas IF Baiano Senhor do Bonfim.",
            imagemRes = R.drawable.img_neabi,
            link = "https://www.instagram.com/neabi.bonfim",
            textoLink = "Perfil do Instagram"
        )

        // Seção 2: Livros
        adicionarTitulo("📚 Biblioteca Afro")

        adicionarCard(
            titulo = "Camões com Dendê",
            descricao = "Obra da etnolinguista Yeda Pessoa de Castro sobre a influência que línguas africanas exerceram na formação do português brasileiro.",
            imagemRes = R.drawable.livro_camoes,
            link = "https://www.amazon.com.br/Cam%C3%B5es-com-Dend%C3%A9-portugu%C3%AAs-afro-brasileiros/dp/6558970120"
        )

        adicionarCard(
            titulo = "Latim em Pó",
            descricao = "Caetano Galindo fala da formação do Português Brasileiro, trazendo muitos aspectos das línguas africanas e nativas.",
            imagemRes = R.drawable.livro_latimempo,
            link = "https://www.amazon.com.br/Latim-p%C3%B3-passeio-forma%C3%A7%C3%A3o-portugu%C3%AAs/dp/6559213536"
        )

        // Seção 3: História
        adicionarTitulo("🌍 História e Resistência")

        adicionarCard(
            titulo = "Quilombo dos Palmares",
            descricao = "O maior símbolo de resistência à escravidão no Brasil, liderado por Zumbi e Dandara.",
            imagemRes = R.drawable.img,
            link = "https://www.gov.br/palmares/pt-br"
        )

        adicionarCard(
            titulo = "Revolta dos Malês",
            descricao = "Maior levante de escravizados urbanos, ocorrido em Salvador em 1835.",
            imagemRes = R.drawable.img_males,
            link = "https://www.amazon.com.br/Rebeli%C3%A3o-escrava-Brasil-Jo%C3%A3o-Jos%C3%A9/dp/8535903941"
        )

        adicionarCard(
            titulo = "Tereza de Benguela",
            descricao = "Rainha do Quilombo do Quariterê. Criou um parlamento local e liderou a resistência no século XVIII.",
            imagemRes = R.drawable.img_tereza,
            link = "https://ufrb.edu.br/bibliotecacecult/noticias/220-tereza-de-benguela-a-escrava-que-virou-rainha-e-liderou-um-quilombo-de-negros-e-indios"
        )
    }

    // --- FUNÇÕES AUXILIARES ---

    private fun adicionarTitulo(texto: String) {
        // 1. Infla o Binding do Item Título
        val itemBinding = ItemTituloSecaoBinding.inflate(layoutInflater, binding.containerLista, false)

        // 2. Define o texto direto na propriedade
        itemBinding.txtTituloSecao.text = texto

        // 3. Adiciona a raiz (root) do item no container principal
        binding.containerLista.addView(itemBinding.root)
    }

    private fun adicionarCard(
        titulo: String,
        descricao: String,
        imagemRes: Int,
        link: String? = null,
        textoLink: String = "Link do Conteúdo"
    ) {
        // 1. Infla o Binding do Item Card
        val itemBinding = ItemCardGaleriaBinding.inflate(layoutInflater, binding.containerLista, false)

        // 2. Acessa as views diretamente
        itemBinding.txtTituloItem.text = titulo
        itemBinding.txtDescItem.text = descricao
        itemBinding.imgItem.setImageResource(imagemRes)

        // 3. Lógica do Link
        if (link != null) {
            itemBinding.btnLink.visibility = View.VISIBLE
            itemBinding.btnLink.text = textoLink
            itemBinding.btnLink.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                startActivity(intent)
            }
        } else {
            itemBinding.btnLink.visibility = View.GONE
        }

        // 4. Adiciona o card pronto na tela
        binding.containerLista.addView(itemBinding.root)
    }
}