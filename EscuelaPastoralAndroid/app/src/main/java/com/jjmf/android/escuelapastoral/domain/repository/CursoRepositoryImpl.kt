package com.jjmf.android.escuelapastoral.domain.repository

import com.google.firebase.firestore.CollectionReference
import com.jjmf.android.escuelapastoral.data.dto.CursoDto
import com.jjmf.android.escuelapastoral.data.module.FirebaseModule
import com.jjmf.android.escuelapastoral.data.repository.CursoRepository
import com.jjmf.android.escuelapastoral.domain.model.Curso
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class CursoRepositoryImpl @Inject constructor(
    @FirebaseModule.CursoCollection private val fb: CollectionReference,
) : CursoRepository {
    override suspend fun getFlow(): Flow<List<Curso>> = callbackFlow{
        val listado = fb.addSnapshotListener { sna, _ ->
            val lista = mutableListOf<CursoDto>()
            sna?.forEach {
                val product = it.toObject(CursoDto::class.java)
                product.id = it.id
                lista.add(product)
            }
            trySend(lista.map { it.toCurso() }).isSuccess
        }
        awaitClose { listado.remove() }
    }
}