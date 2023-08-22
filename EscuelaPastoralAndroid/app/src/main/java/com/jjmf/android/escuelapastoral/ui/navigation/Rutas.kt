package com.jjmf.android.escuelapastoral.ui.navigation

sealed class Rutas(val url:String){
    object Login: Rutas(url = "login")
    object Menu: Rutas(url = "menu")
    object Eventos: Rutas(url = "eventos"){
        object AddEvent : Rutas(url = "add_event")
    }
}
