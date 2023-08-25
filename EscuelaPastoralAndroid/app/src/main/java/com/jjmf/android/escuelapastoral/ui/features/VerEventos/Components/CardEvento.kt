package com.jjmf.android.escuelapastoral.ui.features.VerEventos.Components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.jjmf.android.escuelapastoral.domain.model.Evento

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardEvento(
    evento: Evento,
    click:()->Unit
) {

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
        onClick = click
    ) {

        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(text = evento.titulo)
                Text(text = evento.descrip)
            }

            Column(
                horizontalAlignment = Alignment.End
            ) {
                Button(onClick = {}, enabled = false) {
                    Text(text = "Activo")
                }
                Text(text = "Costo S/50.00")
            }

        }

    }

}