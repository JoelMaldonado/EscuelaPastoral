package com.jjmf.android.escuelapastoral.ui.navigation

sealed class Rutas(val url:String){
    object Login: Rutas(url = "login")
    object Maestro {
        object Menu:Rutas(url = "menu-maestro")
        object MarcarAsistencia: Rutas(url = "marcar-asistencia")
    }
    object Admin {
        object Menu: Rutas(url = "menu")
        object Eventos: Rutas(url = "eventos"){
            object Add : Rutas(url = "add_event")
            object Detail : Rutas(url = "detail_evento?{id}"){
                fun sendId(id:String) = "detail_evento?$id"
            }
            object VerAlumnos : Rutas(url = "alumnos_evento")
            object VerSolicitudes : Rutas(url = "solicitudes_evento")
            object VerMaestros : Rutas(url = "maestros_evento")
            object VerMaestrosDetalle : Rutas(url = "maestros_detalle_evento")
        }
        object Cursos: Rutas(url = "cursos")
        object Usuarios: Rutas(url = "usuarios"){
            object Add:Rutas("add_usuario")
        }
        object Paises: Rutas(url = "paises")
    }
}
