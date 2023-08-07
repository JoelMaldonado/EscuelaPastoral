package com.jjmf.android.escuelapastoral.data.module

import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
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

}