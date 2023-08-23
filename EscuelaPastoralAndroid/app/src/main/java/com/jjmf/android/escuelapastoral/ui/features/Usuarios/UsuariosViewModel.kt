package com.jjmf.android.escuelapastoral.ui.features.Usuarios

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import java.sql.DriverPropertyInfo
import javax.inject.Inject

@HiltViewModel
class UsuariosViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {
}