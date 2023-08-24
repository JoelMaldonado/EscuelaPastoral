package com.jjmf.android.escuelapastoral.data.repository

import com.jjmf.android.escuelapastoral.domain.model.Usuario
import kotlinx.coroutines.flow.Flow

interface UsuarioRepository {
    suspend fun getFlow() : Flow<List<Usuario>>
}

