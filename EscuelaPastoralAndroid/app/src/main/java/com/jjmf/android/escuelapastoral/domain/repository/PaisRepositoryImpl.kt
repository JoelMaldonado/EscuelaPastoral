package com.jjmf.android.escuelapastoral.domain.repository

import com.google.firebase.firestore.CollectionReference
import com.jjmf.android.escuelapastoral.data.dto.PaisDto
import com.jjmf.android.escuelapastoral.data.module.FirebaseModule
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import com.jjmf.android.escuelapastoral.domain.model.Pais
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class PaisRepositoryImpl @Inject constructor(
    @FirebaseModule.PaisCollection private val fb: CollectionReference,
) : PaisRepository {
    override suspend fun getFlow(): Flow<List<Pais>> = callbackFlow{
        val listado = fb.addSnapshotListener { sna, _ ->
            val lista = mutableListOf<PaisDto>()
            sna?.forEach {
                val product = it.toObject(PaisDto::class.java)
                product.id = it.id
                lista.add(product)
            }
            trySend(lista.map { it.toPais() }).isSuccess
        }
        awaitClose { listado.remove() }
    }
}