package com.jjmf.android.escuelapastoral.data.dto

import com.google.firebase.firestore.Exclude
import com.jjmf.android.escuelapastoral.domain.model.TipoUsuario
import com.jjmf.android.escuelapastoral.domain.model.Usuario

data class UsuarioDto(
    @get:Exclude var id: String? = null,
    val nombre: String? = null,
    val documento: String? = null,
    val clave: String? = null,
    val foto:String? = null,
    val tipoUsuario: TipoUsuario? = null
) {
    fun toUsuario(): Usuario {
        return Usuario(
            id = id ?: "Sin ID",
            nombre = nombre ?: "Sin Nombre",
            documento = documento ?: "Sin Documento",
            clave = clave ?: "Sin Clave",
            foto = foto ?: "Sin Foto",
            tipo = tipoUsuario ?: TipoUsuario.SinAcceso
        )
    }
}
