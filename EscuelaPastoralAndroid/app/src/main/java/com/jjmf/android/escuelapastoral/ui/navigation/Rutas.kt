package com.jjmf.android.escuelapastoral.ui.navigation

sealed class Rutas(val url:String){
    object Login: Rutas(url = "login")
    object Menu: Rutas(url = "menu")
    object Eventos: Rutas(url = "eventos"){
        object Add : Rutas(url = "add_event")
        object Detail : Rutas(url = "detail_evento")
        object VerAlumnos : Rutas(url = "alumnos_evento")
        object VerMaestros : Rutas(url = "maestros_evento")
        object VerMaestrosDetalle : Rutas(url = "maestros_detalle_evento")
    }
    object Cursos: Rutas(url = "cursos")
    object Usuarios: Rutas(url = "usuarios")
}
