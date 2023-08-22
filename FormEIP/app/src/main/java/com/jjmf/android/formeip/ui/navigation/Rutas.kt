package com.jjmf.android.formeip.ui.navigation

sealed class Rutas(val url:String){
    object Menu : Rutas(url = "menu")
    object Formulario : Rutas(url = "formulario")
}
