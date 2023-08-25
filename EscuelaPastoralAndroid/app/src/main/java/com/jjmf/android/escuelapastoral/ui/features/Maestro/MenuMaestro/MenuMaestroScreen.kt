package com.jjmf.android.escuelapastoral.ui.features.Maestro.MenuMaestro

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun MenuMaestroScreen(
    toMarcarAsistencia: () -> Unit,
    viewModel: MenuMaestroViewModel = hiltViewModel(),
) {
    Button(
        onClick = toMarcarAsistencia
    ) {
        Text(text = "Asistencia")
    }
}