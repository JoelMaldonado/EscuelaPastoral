package com.jjmf.android.escuelapastoral.data.dto

import com.google.firebase.firestore.Exclude
import com.jjmf.android.escuelapastoral.domain.model.Pais


data class PaisDto(
    @get:Exclude var id:String? = null,
    val nombre: String? = null,
    val img: String? = null
){
    fun toPais():Pais{
        return Pais(
            id = id ?: "Sin ID",
            nombre = nombre ?: "Sin Nombre",
            img = img ?: "Sin Imagen"
        )
    }
}
