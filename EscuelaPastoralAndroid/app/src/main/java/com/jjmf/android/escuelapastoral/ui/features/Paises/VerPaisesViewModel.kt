package com.jjmf.android.escuelapastoral.ui.features.Paises

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jjmf.android.escuelapastoral.data.repository.PaisRepository
import com.jjmf.android.escuelapastoral.domain.model.Pais
import com.jjmf.android.escuelapastoral.domain.model.Usuario
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VerPaisesViewModel @Inject constructor(
    private val repository: PaisRepository
) : ViewModel() {

    var list by mutableStateOf<List<Pais>>(emptyList())
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