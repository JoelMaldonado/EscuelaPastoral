package com.jjmf.android.escuelapastoral.data.dto

import com.google.firebase.firestore.Exclude
import com.jjmf.android.escuelapastoral.domain.model.Curso

data class CursoDto(
    @get:Exclude var id:String? = null,
    var nombre:String? = null,
    var descrip:String? = null
){
    fun toCurso() : Curso {
        return Curso(
            id = id ?: "Sin ID",
            nombre = nombre ?: "Sin nombre",
            descrip = descrip ?: "Sin Descrip"
        )
    }
}
