package com.jjmf.android.escuelapastoral.data.repository

import com.jjmf.android.escuelapastoral.domain.model.Pais
import kotlinx.coroutines.flow.Flow

interface PaisRepository {
    suspend fun getFlow(): Flow<List<Pais>>
}