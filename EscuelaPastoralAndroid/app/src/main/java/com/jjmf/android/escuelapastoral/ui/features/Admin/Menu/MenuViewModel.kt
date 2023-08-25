package com.jjmf.android.escuelapastoral.ui.features.Admin.Menu

import androidx.annotation.DrawableRes
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.R
import com.jjmf.android.escuelapastoral.data.repository.CursoRepository
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import com.jjmf.android.escuelapastoral.domain.model.Curso
import com.jjmf.android.escuelapastoral.domain.model.Pais
import com.jjmf.android.escuelapastoral.domain.model.Usuario
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MenuViewModel @Inject constructor(
    private val repository: CursoRepository,
    private val repoPais: PaisRepository
) : ViewModel() {

    val list = listOf(
        Persona(
            nombre = "Katty T.",
            foto = R.drawable.persona1
        ),
        Persona(
            nombre = "Ethan F.",
            foto = R.drawable.persona3
        ),
        Persona(
            nombre = "Maia N.",
            foto = R.drawable.persona2
        ),
        Persona(
            nombre = "Sean P.",
            foto = R.drawable.persona4
        ),
        Persona(
            nombre = "Katty T.",
            foto = R.drawable.persona1
        ),
        Persona(
            nombre = "Ethan F.",
            foto = R.drawable.persona3
        ),
        Persona(
            nombre = "Maia N.",
            foto = R.drawable.persona2
        ),
        Persona(
            nombre = "Sean P.",
            foto = R.drawable.persona4
        ),
    )

    var listCursos by mutableStateOf<List<Curso>>(emptyList())
    var listPaises by mutableStateOf<List<Pais>>(emptyList())

    fun init(){
        viewModelScope.launch(Dispatchers.IO){
            repository.getFlow().collect{
                listCursos = it
            }
            repoPais.getFlow().collect{
                listPaises = it
            }
        }
    }

    data class Persona(
        val nombre:String,
        @DrawableRes val foto: Int
    )

}