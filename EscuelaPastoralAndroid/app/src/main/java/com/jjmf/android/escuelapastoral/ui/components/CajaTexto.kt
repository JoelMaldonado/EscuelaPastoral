package com.jjmf.android.escuelapastoral.ui.components

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.KeyboardType

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CajaTexto(
    valor:String,
    newValor:(String)->Unit,
    label:String? = null,
    keyboardType : KeyboardType = KeyboardType.Text
) {

    TextField(
        value = valor,
        onValueChange = newValor,
        label = {
            if (label!=null){
                Text(text = label)
            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType
        )
    )

}