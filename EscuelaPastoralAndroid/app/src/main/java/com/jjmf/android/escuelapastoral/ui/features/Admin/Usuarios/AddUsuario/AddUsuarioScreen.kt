package com.jjmf.android.escuelapastoral.ui.features.Admin.Usuarios.AddUsuario

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddUsuarioScreen(
    viewModel: AddUsuarioViewModel = hiltViewModel(),
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        OutlinedTextField(
            value = viewModel.nombre,
            onValueChange = { viewModel.nombre = it },
            label = { Text("Nombres") }
        )

        OutlinedTextField(
            value = viewModel.apellidos,
            onValueChange = { viewModel.apellidos = it },
            label = { Text("Apellidos") }
        )

        OutlinedTextField(
            value = viewModel.correo,
            onValueChange = { viewModel.correo = it },
            label = { Text("Correo") }
        )

        OutlinedTextField(
            value = viewModel.doc,
            onValueChange = { viewModel.doc = it },
            label = { Text("Documento") }
        )

        OutlinedTextField(
            value = viewModel.cel,
            onValueChange = { viewModel.cel = it },
            label = { Text("Celular") }
        )

        OutlinedTextField(
            value = viewModel.userType,
            onValueChange = { viewModel.userType = it },
            label = { Text("Tipo Usuario") }
        )

        Button(
            onClick = viewModel::insert,
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "Agregar")
        }
    }
}