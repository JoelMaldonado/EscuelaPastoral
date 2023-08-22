package com.jjmf.android.escuelapastoral.data.repository

import com.jjmf.android.escuelapastoral.data.dto.EventoDto
import com.jjmf.android.escuelapastoral.domain.model.Evento
import kotlinx.coroutines.flow.Flow

interface EventoRepository {

    suspend fun insert(eventoDto: EventoDto) : Boolean

    suspend fun getFlow() : Flow<List<Evento>>

}