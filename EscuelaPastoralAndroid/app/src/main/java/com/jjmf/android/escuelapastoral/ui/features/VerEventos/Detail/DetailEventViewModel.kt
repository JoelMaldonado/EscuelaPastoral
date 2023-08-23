package com.jjmf.android.escuelapastoral.ui.features.VerEventos.Detail

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailEventViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {
}