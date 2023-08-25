package com.jjmf.android.escuelapastoral.ui.features.Admin.VerEventos.Detail

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.domain.model.Evento
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailEventViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {

    var evento by mutableStateOf<Evento?>(null)
    var cargando by mutableStateOf(false)
    var error by mutableStateOf<String?>(null)

    fun init(id: String) {
        viewModelScope.launch(Dispatchers.IO){
            try {
                cargando = true
                evento = repository.get(id)
            }catch (e:Exception){
                error = null
            }finally {
                cargando = false
            }
        }
    }
}