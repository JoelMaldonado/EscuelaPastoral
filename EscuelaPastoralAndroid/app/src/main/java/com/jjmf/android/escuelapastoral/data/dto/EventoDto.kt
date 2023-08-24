package com.jjmf.android.escuelapastoral.data.dto

import com.google.firebase.Timestamp
import com.google.firebase.firestore.Exclude
import com.jjmf.android.escuelapastoral.domain.model.Evento

data class EventoDto(
    @get:Exclude var id: String? = null,
    val titulo: String? = null,
    val descrip: String? = null,
    val cant: Int? = null,
    val fechaInicio: Timestamp? = null,
    val fechaFin: Timestamp? = null,
    val pais: String? = null,
    val direc: String? = null,
    val costo: Double? = null,
) {
    fun toEvento(): Evento {
        return Evento(
            id =  id ?: "",
            titulo =  titulo ?: "Sin titulo",
            descrip =  descrip ?: "Sin descripción",
            cant =  cant ?: 0,
            fechaInicio =   "Sin fecha",
            fechaFin =  "Sin fecha",
            pais =  pais ?: "Sin pais",
            direc =  direc ?: "Sin dirección",
            costo =  costo ?: 0.0,
        )
    }
}
