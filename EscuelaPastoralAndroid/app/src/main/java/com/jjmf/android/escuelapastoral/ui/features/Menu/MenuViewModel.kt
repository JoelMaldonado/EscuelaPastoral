package com.jjmf.android.escuelapastoral.ui.features.Menu

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {
}