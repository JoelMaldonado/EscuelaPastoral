package com.jjmf.android.escuelapastoral.ui.features.Maestro.MenuMaestro

import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MenuMaestroViewModel @Inject constructor(
    private val repository: PaisRepository,
) : ViewModel() {
}