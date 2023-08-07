package com.jjmf.android.escuelapastoral.ui.navigation

sealed class Rutas(val url:String){
    object Login: Rutas(url = "login")
    object Menu: Rutas(url = "menu")
}
