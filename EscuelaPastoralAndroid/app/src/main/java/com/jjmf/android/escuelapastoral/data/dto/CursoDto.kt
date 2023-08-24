package com.jjmf.android.escuelapastoral.data.dto

import com.google.firebase.firestore.Exclude
import com.jjmf.android.escuelapastoral.domain.model.Curso

data class CursoDto(
    @get:Exclude var id:String? = null,
    val nombre:String? = null,
    val descrip:String? = null,
    val imagen:String? = null
){
    fun toCurso() : Curso {
        return Curso(
            id = id ?: "Sin Data",
            nombre = nombre ?: "Sin Data",
            descrip = descrip ?: "Sin Data",
            imagen = imagen ?: "Sin Data"
        )
    }
}
