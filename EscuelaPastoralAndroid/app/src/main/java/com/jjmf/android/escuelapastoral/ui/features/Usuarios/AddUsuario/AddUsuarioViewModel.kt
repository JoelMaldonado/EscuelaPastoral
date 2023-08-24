package com.jjmf.android.escuelapastoral.ui.features.Usuarios.AddUsuario

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.jjmf.android.escuelapastoral.data.dto.UsuarioDto
import com.jjmf.android.escuelapastoral.data.repository.UsuarioRepository
import com.jjmf.android.escuelapastoral.domain.model.TipoUsuario
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AddUsuarioViewModel @Inject constructor(
    private val repository: UsuarioRepository,
) : ViewModel() {

    var nombre by mutableStateOf("")
    var apellidos by mutableStateOf("")
    var correo by mutableStateOf("")
    var doc by mutableStateOf("")
    var cel by mutableStateOf("")
    var userType by mutableStateOf("")

    fun insert(){

        // Aquí puedes manejar la lógica para insertar el usuario en tu backend o base de datos.
        val newUser = UsuarioDto(
            nombre = nombre,
            documento = doc,
            clave = "",
            foto = "",
            tipoUsuario = if (userType == "Usuario") TipoUsuario.Usuario else TipoUsuario.SinAcceso
        )
    }
}