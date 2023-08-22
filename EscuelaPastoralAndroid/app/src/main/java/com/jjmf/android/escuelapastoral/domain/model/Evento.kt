package com.jjmf.android.escuelapastoral.domain.model

data class Evento(
    val id:String,
    val titulo:String,
    val descrip:String,
    val cant:Int,
    val fechaInicio:String,
    val fechaFin:String,
    val pais:String,
    val direc:String,
    val costo:Double
)
