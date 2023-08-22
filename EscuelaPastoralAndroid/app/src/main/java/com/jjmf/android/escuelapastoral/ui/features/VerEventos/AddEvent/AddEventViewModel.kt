package com.jjmf.android.escuelapastoral.ui.features.VerEventos.AddEvent

import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.dto.EventoDto
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AddEventViewModel @Inject constructor(
    private val repository: EventoRepository,
) : ViewModel() {

    var titulo by mutableStateOf("")
    var descrip by mutableStateOf("")
    var cant by mutableStateOf("")
    var fechaInicio by mutableStateOf("")
    var fechaFin by mutableStateOf("")
    var pais by mutableStateOf("")
    var direc by mutableStateOf("")
    var costo by mutableStateOf("")

    var back by mutableStateOf(false)
    fun save() {
        viewModelScope.launch(Dispatchers.IO) {
            val dto = EventoDto(
                titulo = titulo,
                descrip = descrip,
                cant = cant.toIntOrNull(),
                fechaInicio = fechaInicio,
                fechaFin = fechaFin,
                pais = pais,
                direc = direc,
                costo = costo.toDoubleOrNull(),
            )
            if (repository.insert(dto)){
                back = true
            }
        }
    }
}