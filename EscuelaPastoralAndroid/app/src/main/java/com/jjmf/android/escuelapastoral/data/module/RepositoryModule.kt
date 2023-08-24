package com.jjmf.android.escuelapastoral.data.module

import com.jjmf.android.escuelapastoral.data.repository.CursoRepository
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
import com.jjmf.android.escuelapastoral.domain.repository.CursoRepositoryImpl
import com.jjmf.android.escuelapastoral.domain.repository.EventoRepositoryImpl
import com.jjmf.android.escuelapastoral.domain.repository.PaisRepositoryImpl
import com.jjmf.android.escuelapastoral.domain.repository.UsuarioRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun usuarioRepo(impl: UsuarioRepositoryImpl): UsuarioRepository

    @Binds
    abstract fun eventoRepo(impl: EventoRepositoryImpl): EventoRepository

    @Binds
    abstract fun cursoRepo(impl: CursoRepositoryImpl): CursoRepository

    @Binds
    abstract fun paisRepo(impl: PaisRepositoryImpl): PaisRepository
}