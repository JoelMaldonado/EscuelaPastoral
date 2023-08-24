package com.jjmf.android.escuelapastoral.data.repository

import com.jjmf.android.escuelapastoral.domain.model.Curso
import kotlinx.coroutines.flow.Flow

interface CursoRepository {
    suspend fun getFlow() : Flow<List<Curso>>
}