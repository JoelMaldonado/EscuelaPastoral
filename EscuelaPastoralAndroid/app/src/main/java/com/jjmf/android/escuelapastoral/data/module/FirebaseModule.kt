package com.jjmf.android.escuelapastoral.data.module

import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class FirebaseModule {

    @Singleton
    @Provides
    fun provideFirebase() = FirebaseFirestore.getInstance()

    @EventosCollection
    @Provides
    @Singleton
    fun provideEventos() = provideFirebase().collection("Eventos")

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class EventosCollection

    @CursoCollection
    @Provides
    @Singleton
    fun provideCursos() = provideFirebase().collection("Cursos")

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class CursoCollection

    @UsuarioCollection
    @Provides
    @Singleton
    fun provideUsuarios() = provideFirebase().collection("Usuarios")

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class UsuarioCollection

    @PaisCollection
    @Provides
    @Singleton
    fun providePais() = provideFirebase().collection("Paises")

    @Qualifier
    @Retention(AnnotationRetention.BINARY)
    annotation class PaisCollection
}