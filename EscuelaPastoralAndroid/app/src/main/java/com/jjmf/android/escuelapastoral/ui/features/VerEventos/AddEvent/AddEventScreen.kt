package com.jjmf.android.escuelapastoral.ui.features.VerEventos.AddEvent

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjmf.android.escuelapastoral.ui.components.CajaTexto
import com.jjmf.android.escuelapastoral.ui.theme.Titulo

@Composable
fun AddEventScreen(
    back: () -> Unit,
    viewModel: AddEventViewModel = hiltViewModel(),
) {

    if (viewModel.back){
        LaunchedEffect(key1 = Unit){
            back()
            viewModel.back = false
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = "Agregar Evento", style = Titulo)

        CajaTexto(
            valor = viewModel.titulo,
            newValor = {
                viewModel.titulo = it
            },
            label = "Titulo"
        )
        CajaTexto(
            valor = viewModel.descrip,
            newValor = {
                viewModel.descrip = it
            },
            label = "Descripción"
        )
        CajaTexto(
            valor = viewModel.pais,
            newValor = {
                viewModel.pais = it
            },
            label = "Pais"
        )
        CajaTexto(
            valor = viewModel.direc,
            newValor = {
                viewModel.direc = it
            },
            label = "Dirección"
        )
        CajaTexto(
            valor = viewModel.cant,
            newValor = {
                viewModel.cant = it
            },
            label = "Capacidad",
            keyboardType = KeyboardType.Number
        )
        CajaTexto(
            valor = viewModel.fechaInicio,
            newValor = {
                viewModel.fechaInicio = it
            },
            label = "Fecha Inicio"
        )
        CajaTexto(
            valor = viewModel.fechaFin,
            newValor = {
                viewModel.fechaFin = it
            },
            label = "Fecha Final"
        )
        CajaTexto(
            valor = viewModel.costo,
            newValor = { viewModel.costo = it },
            label = "Costo de inscrición",
            keyboardType = KeyboardType.Decimal
        )

        Button(
            onClick = viewModel::save
        ) {
            Text(text = "Guardar")
        }
    }
}