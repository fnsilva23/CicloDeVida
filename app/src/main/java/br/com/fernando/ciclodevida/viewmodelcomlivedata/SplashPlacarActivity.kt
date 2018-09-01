package br.com.fernando.ciclodevida.viewmodelcomlivedata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import br.com.fernando.ciclodevida.R

class SplashPlacarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_placar)
        carregar()
    }

    private fun carregar() {
        Handler().postDelayed({
            chamarProximaTela()
        }, 2000L)
    }

    private fun chamarProximaTela() {
        val proximaTelaIntent = Intent(this, PlacarActivity::class.java)
        startActivity(proximaTelaIntent)
        finish()
    }
}
