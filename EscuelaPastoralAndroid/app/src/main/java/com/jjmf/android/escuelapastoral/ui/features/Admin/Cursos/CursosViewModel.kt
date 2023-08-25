package com.jjmf.android.escuelapastoral.ui.features.Admin.Cursos

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.repository.CursoRepository
import com.jjmf.android.escuelapastoral.data.repository.EventoRepository
import com.jjmf.android.escuelapastoral.domain.model.Curso
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class CursosViewModel @Inject constructor(
    private val repository: CursoRepository
) : ViewModel(){

    var list by mutableStateOf<List<Curso>>(emptyList())
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