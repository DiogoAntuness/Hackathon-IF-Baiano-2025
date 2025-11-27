package com.example.raizafro.models

data class Pergunta(
    val text: String,
    val options: List<String>,
    val correctIndex: Int,
    val curiosidade: String
)

val perguntas = listOf(
    // APROVADAS:
    Pergunta(
        text = "Cuscuz faz parte da sua alimentação?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = " A origem do cuscuz remonta ao norte da África, onde foi criado provavelmente pelos povos berberes e disseminado pelos árabes. O prato chegou ao Brasil com os escravizados durante o período colonial e foi adaptado usando ingredientes locais, como o milho, em vez da sêmola de trigo original."
    ),

    Pergunta(
        text = "Você já usou tranças, dreads ou penteados com trancinhas?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Tranças são uma prática ancestral africana, usadas para identificar etnias, status social e até mapas de fuga."
    ),

    Pergunta(
        text = "Você gosta de comer acarajé?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "O acarajé é um alimento de origem iorubá, trazido por mulheres negras e ligado a tradições religiosas afro-brasileiras."
    ),

    Pergunta(
        text = "Você gosta de samba ou pagode?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "O samba nasceu de tradições musicais africanas, especialmente dos terreiros e comunidades negras urbanas."
    ),

    Pergunta(
        text = "Você costuma usar a palavra 'cafuné' para descrever carinho?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "'Cafuné' é uma palavra de origem africana (provavelmente do quimbundo kifumune) e é uma das poucas palavras em português que não tem tradução direta e exata para outros idiomas. É uma herança de afeto ancestral."
    ),

    Pergunta(
        text = "Você sabe o significado da palavra ‘axé’?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "‘Axé’ é uma palavra de origem iorubá que significa energia vital, poder, força ou energia. A palavra axé é usada como saudação em contextos das religiões afro-brasileiras."
    ),

    Pergunta(
        text = "Você costuma usar branco no Réveillon?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "O uso do branco no Réveillon deriva diretamente das tradições do Candomblé e da Umbanda, onde vestir branco representa paz, renovação e homenagem a Oxalá."
    ),

    Pergunta(
        text = "Você gosta de feijoada?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "A feijoada tem origem nas cozinhas das pessoas negras escravizadas, que transformavam restos de carne em um prato forte e saboroso — hoje símbolo nacional."
    ),

    Pergunta(
        text = "Você já ouviu ou falou expressões como: 'aperreado', ‘caô’, ‘muvuca’, ‘moleque’?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Essas gírias populares têm origem africana (iorubá, quimbundo, banto). A influência linguística negra é uma das maiores do português brasileiro."
    ),

    Pergunta(
        text = "Você já falou 'caçula' para se referir ao irmão/filho(a) mais novo?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "A origem da palavra 'caçula' está no quimbundo, com o significado de 'último filho' ou 'membro mais novo'. Incorporada ao português brasileiro principalmente por meio do trabalho doméstico e da influência das mulheres negras escravizadas."
    ),

    Pergunta(
        text = "Você já ouviu ou fala 'baba' para se referir ao jogo com a galera, como exemplo o futebol",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Essa gíria popular na Bahia têm origem africana da língua quimbundo."
    ),

    Pergunta(
        text = "Você fala 'babá' para se referir a uma pessoa que cuida de crianças",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = " palavra 'babá' tem origem na língua quimbundo, onde o verbo 'kubaba' significa 'acalentar ou embalar uma criança para adormecer'."
    ),

    Pergunta(
        text = "Já viu em vídeos ou presenciou, um pastor perguntar 'quem é você?' ou 'o que quer aqui?' para a entidade na hora da libertação?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Conversar com espíritos (entrevista) é uma estrutura típica da Umbanda e religiões mediúnicas. No protestantismo tradicional (luterano/calvinista), não há diálogo. Esse hábito nas igrejas brasileiras reflete nossa cultura de matriz africana de interação com o mundo espiritual."
    ),

    Pergunta(
        text = "Você já viu alguém 'sapatear', 'pular' ou 'marchar' no poder durante um culto?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "Esse movimento corporal de bater os pés ritmicamente no chão é fenomenologicamente igual à dança dos Caboclos na Umbanda. O protestantismo histórico europeu é estático; o corpo que dança no culto é uma marca afro-brasileira."
    ),

    Pergunta(
        text = "Você costuma orar de mãos dadas formando um círculo (roda de oração), por exemplo em igrejas?",
        options = listOf("Sim", "Não"),
        correctIndex = 0,
        curiosidade = "A formação em 'roda' é a geometria sagrada das culturas africanas e indígenas para circulação de energia. O modelo europeu tradicional é linear (bancos em fileiras). O círculo de oração é uma herança direta dessa ancestralidade comunitária."
    ),

)
