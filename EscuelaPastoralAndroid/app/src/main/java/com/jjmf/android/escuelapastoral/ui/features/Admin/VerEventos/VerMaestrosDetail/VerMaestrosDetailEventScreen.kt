package com.jjmf.android.escuelapastoral.ui.features.Admin.VerEventos.VerMaestrosDetail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjmf.android.escuelapastoral.ui.theme.Titulo

@Composable
fun VerMaestrosDetailEventScreen(
    viewModel: VerMaestrosDetailEventViewModel = hiltViewModel(),
) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = "Efesios - Adriel Albino", style = Titulo)
        
        Text(text = "Alumnos", style = Titulo, modifier = Modifier.align(Alignment.Start))

        repeat(4){
            Text(text = "$it. David Alfredo Matias Pachas")
        }
    }
}