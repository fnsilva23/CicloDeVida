package br.com.fernando.ciclodevida

import android.arch.lifecycle.ViewModel

//Classe do Lifecycle que mantém os dados ativos para podermos utilizá-los mesmo após a reinicialização da activity
class MainViewModel: ViewModel() {

    var placarCasa = 0
    var placarVisitante = 0

}