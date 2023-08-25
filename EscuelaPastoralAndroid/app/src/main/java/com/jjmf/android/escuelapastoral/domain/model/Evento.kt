package com.jjmf.android.escuelapastoral.domain.model

import com.google.firebase.Timestamp
import java.text.SimpleDateFormat
import java.util.Locale

data class Evento(
    val id:String,
    val titulo:String,
    val descrip:String,
    val cant:Int,
    val fechaInicio:Timestamp,
    val fechaFin:Timestamp,
    val pais:String,
    val direc:String,
    val costo:Double
){
    fun toFecha(fecha: Timestamp?, pattern: String): String {
        return if (fecha!=null){
            SimpleDateFormat(pattern, Locale.getDefault()).format(fecha.toDate())
        }else "Sin Fecha"
    }
}