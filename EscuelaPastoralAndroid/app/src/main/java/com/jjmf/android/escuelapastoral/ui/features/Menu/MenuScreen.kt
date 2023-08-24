package com.jjmf.android.escuelapastoral.ui.features.Menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MenuScreen(
    toEventos: () -> Unit,
    toCursos: () -> Unit,
    toUsuarios: () -> Unit,
    toPaises: () -> Unit,
    viewModel: MenuViewModel = hiltViewModel(),
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Button(
            onClick = toEventos
        ) {
            Text(text = "Eventos")
        }

        Button(
            onClick = toCursos
        ) {
            Text(text = "Cursos")
        }

        Button(
            onClick = toUsuarios
        ) {
            Text(text = "Usuarios")
        }
        Button(
            onClick = toPaises
        ) {
            Text(text = "Paises")
        }

    }
}