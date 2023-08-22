package com.jjmf.android.formeip.ui.features.Formulario

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class FormularioViewModel @Inject constructor(

) : ViewModel() {

    var doc by mutableStateOf("")
    var nombres by mutableStateOf("")
    var apellidos by mutableStateOf("")

}