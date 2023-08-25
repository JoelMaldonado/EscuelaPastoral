package com.jjmf.android.escuelapastoral.ui.features.Admin.Usuarios

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
import com.jjmf.android.escuelapastoral.domain.model.Curso
import com.jjmf.android.escuelapastoral.domain.model.Usuario
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.sql.DriverPropertyInfo
import javax.inject.Inject

@HiltViewModel
class UsuariosViewModel @Inject constructor(
    private val repository: UsuarioRepository,
) : ViewModel() {

    var list by mutableStateOf<List<Usuario>>(emptyList())
    var error by mutableStateOf<String?>(null)

    fun init(){
        viewModelScope.launch(Dispatchers.IO){
            try {
                repository.getFlow().collect{
                    list = it
                }
            }catch (e:Exception){
                error = e.message
            }
        }
    }

}