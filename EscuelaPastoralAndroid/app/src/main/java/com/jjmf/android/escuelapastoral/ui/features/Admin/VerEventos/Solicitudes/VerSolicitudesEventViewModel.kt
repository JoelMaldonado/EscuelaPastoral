package com.jjmf.android.escuelapastoral.ui.features.Admin.VerEventos.Solicitudes

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class VerSolicitudesEventViewModel @Inject constructor(
    private val repository: UsuarioRepository,
) : ViewModel() {

}