package com.example.raizafro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.raizafro.databinding.ActivityCuriosidadesBinding

class CuriosidadesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCuriosidadesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCuriosidadesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val curiosidades = listOf(
            "A palavra 'cafuné' tem origem no quimbundo: 'kafuné' significa fazer carinho na cabeça.",
            "O samba nasceu de tradições africanas trazidas pelos povos escravizados.",
            "A capoeira é uma mistura de luta e dança criada por africanos no Brasil.",
            "Diversas gírias como 'moleque', 'bagunça' e 'dengo' vêm de línguas africanas."
        )

        binding.txtCuriosidades.text = curiosidades.joinToString("\n\n• ", prefix = "• ")
    }
}
