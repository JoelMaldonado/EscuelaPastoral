package com.jjmf.android.formeip.ui.features.Formulario

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormularioScreen(
    viewModel: FormularioViewModel = hiltViewModel(),
) {

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {


        TextField(
            value = viewModel.doc,
            onValueChange = {
                viewModel.doc = it
            },
            label = {
                Text(text = "Documento")
            }
        )
        TextField(
            value = viewModel.nombres,
            onValueChange = {
                viewModel.nombres = it
            },
            label = {
                Text(text = "Nombres")
            }
        )
        TextField(
            value = viewModel.apellidos,
            onValueChange = {
                viewModel.apellidos = it
            },
            label = {
                Text(text = "Apellidos")
            }
        )

        Button(
            onClick = {}
        ) {
            Text(text = "Guardar")
        }

    }

}