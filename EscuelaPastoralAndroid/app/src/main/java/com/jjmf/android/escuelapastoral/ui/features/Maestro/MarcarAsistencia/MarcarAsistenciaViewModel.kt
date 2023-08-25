package com.jjmf.android.escuelapastoral.ui.features.Maestro.MarcarAsistencia

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MarcarAsistenciaViewModel @Inject constructor(
    private val repository: PaisRepository,
) : ViewModel() {
}