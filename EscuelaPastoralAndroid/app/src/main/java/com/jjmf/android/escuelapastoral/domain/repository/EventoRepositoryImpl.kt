package com.jjmf.android.escuelapastoral.domain.repository

import com.google.firebase.firestore.CollectionReference
import com.jjmf.android.escuelapastoral.data.dto.EventoDto
import com.jjmf.android.escuelapastoral.data.module.FirebaseModule
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.domain.model.Evento
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class EventoRepositoryImpl @Inject constructor(
    @FirebaseModule.EventosCollection private val fb: CollectionReference,
) : EventoRepository {
    override suspend fun insert(eventoDto: EventoDto): Boolean {
        return try {
            fb.add(eventoDto).await()
            true
        } catch (e: Exception) {
            false
        }
    }

    override suspend fun getFlow(): Flow<List<Evento>> = callbackFlow {
        val listado = fb.addSnapshotListener { sna, _ ->
            val lista = mutableListOf<EventoDto>()
            sna?.forEach {
                val product = it.toObject(EventoDto::class.java)
                product.id = it.id
                lista.add(product)
            }
            trySend(lista.map { it.toEvento() }).isSuccess
        }
        awaitClose { listado.remove() }
    }
}