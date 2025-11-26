import com.example.raizafro.data.Pergunta

object PerguntasRepository {

    fun getPerguntas(): List<Pergunta> {
        return listOf(
            Pergunta(
                "Você usa branco no Réveillon?",
                "A tradição de usar branco na virada vem das religiões afro-brasileiras ligadas a Oxalá.",
                10
            ),
            Pergunta(
                "Você já pulou sete ondas?",
                "Esse costume está ligado às tradições afro-atlânticas associadas a Iemanjá.",
                10
            ),
            Pergunta(
                "Você utiliza gírias como 'axé', 'mandinga', 'treta' ou 'mó'?",
                "Muitas gírias brasileiras têm origem africana (iorubá, quimbundo, quicongo).",
                5
            ),
            Pergunta(
                "Você gosta de feijoada, vatapá ou acarajé?",
                "A culinária afro-brasileira influencia profundamente a gastronomia nacional.",
                10
            )
        )
    }
}
