package com.jjmf.android.escuelapastoral.domain.repository

import com.google.firebase.firestore.CollectionReference
import com.jjmf.android.escuelapastoral.data.module.FirebaseModule
import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
import com.jjmf.android.escuelapastoral.data.dto.UsuarioDto
import com.jjmf.android.escuelapastoral.domain.model.Usuario
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import javax.inject.Inject

class UsuarioRepositoryImpl @Inject constructor(
    @FirebaseModule.UsuarioCollection private val fb:CollectionReference
) : UsuarioRepository {
    override suspend fun getFlow(): Flow<List<Usuario>>  = callbackFlow {
        val listado = fb.addSnapshotListener { sna, _ ->
            val lista = mutableListOf<UsuarioDto>()
            sna?.forEach {
                val product = it.toObject(UsuarioDto::class.java)
                product.id = it.id
                lista.add(product)
            }
            trySend(lista.map { it.toUsuario() }).isSuccess
        }
        awaitClose { listado.remove() }
    }
}