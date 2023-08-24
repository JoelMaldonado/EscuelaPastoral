package com.jjmf.android.escuelapastoral.domain.model

data class Usuario(
    val id:String,
    val nombre:String,
    val documento:String,
    val clave:String,
    val foto:String,
    val tipo: TipoUsuario
)

enum class TipoUsuario{
    Admin,
    Usuario,
    Maestro,
    Alumno,
    SinAcceso
}
