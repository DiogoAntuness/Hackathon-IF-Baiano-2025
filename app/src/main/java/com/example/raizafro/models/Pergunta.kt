package com.example.raizafro.models

data class Pergunta(
    val text: String,
    val options: List<String>,
    val correctIndex: Int,
    val curiosidade: String
)

val perguntas = listOf(
    Pergunta(
        text = "Você costuma usar branco no Réveillon?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "O uso do branco no Réveillon deriva diretamente das tradições do Candomblé e da Umbanda, onde vestir branco representa paz, renovação e homenagem a Oxalá."
    ),
    Pergunta(
        text = "Você já usou a palavra ‘axé’ para desejar coisas boas?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "‘Axé’ é uma palavra de origem iorubá que significa energia vital. É amplamente usada no Brasil sem que sua origem africana seja reconhecida."
    ),
    Pergunta(
        text = "Você costuma comer acarajé, vatapá ou caruru?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Essas comidas são patrimônio do povo negro e surgiram através das Quituteiras Baianas, mulheres africanas escravizadas que sustentavam famílias vendendo seus pratos."
    ),
    Pergunta(
        text = "Você acredita em simpatias (como arruda, olho-gordo, banho de sal grosso)?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Grande parte das simpatias brasileiras vem das práticas religiosas e culturais afro-diaspóricas, adaptadas ao cotidiano."
    ),
    Pergunta(
        text = "Você já ouviu ou falou expressões como: ‘mó tempão’, ‘mandinga’, ‘caô’, ‘muvuca’, ‘moleque’?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Essas gírias populares têm origem africana (iorubá, quimbundo, banto). A influência linguística negra é uma das maiores do português brasileiro."
    ),
    Pergunta(
        text = "Você gosta de samba, pagode, funk ou axé?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Esses gêneros musicais nasceram diretamente das tradições e resistência cultural negra no Brasil."
    )
)
