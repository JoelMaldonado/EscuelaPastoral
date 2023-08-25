package com.jjmf.android.escuelapastoral.ui.features.Admin.VerEventos

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.domain.model.Evento
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VerEventosViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {

    var list by mutableStateOf<List<Evento>>(emptyList())

    fun init() {
        viewModelScope.launch(Dispatchers.IO){
            repository.getFlow().collect{
                list = it
            }
        }
    }

}