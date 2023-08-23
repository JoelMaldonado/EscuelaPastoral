package com.jjmf.android.escuelapastoral.ui.features.VerEventos.Detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjmf.android.escuelapastoral.ui.theme.Titulo

@Composable
fun DetailEventScreen(
    toVerMaestros:()->Unit,
    viewModel: DetailEventViewModel = hiltViewModel(),
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = "Detalle Evento", style = Titulo)

        DetalleItem(
            title = "Titulo",
            descrip = "Curayacu 2023"
        )
        DetalleItem(
            title = "Descripción",
            descrip = "Evento para jovenes, edicion 3"
        )
        DetalleItem(
            title = "Pais",
            descrip = "Peru"
        )
        DetalleItem(
            title = "Direccion",
            descrip = "Calle. Las almejas 123 - San Bartolo"
        )
        DetalleItem(
            title = "Capacidad",
            descrip = "200"
        )
        DetalleItem(
            title = "Fecha Inicio",
            descrip = "01/01/2024"
        )
        DetalleItem(
            title = "Fecha Fin",
            descrip = "05/01/2024"
        )
        DetalleItem(
            title = "Costo",
            descrip = "S/50"
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround
        ){
            Button(
                onClick = {

                }
            ) {
                Text(text = "Participantes")
            }
            Button(
                onClick = toVerMaestros
            ) {
                Text(text = "Cursos")
            }
        }

        Button(
            onClick = {

            }
        ) {
            Text(text = "Editar Evento")
        }

        Button(
            onClick = {

            },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.error
            )
        ) {
            Text(text = "Eliminar Evento")
        }
    }
}

@Composable
fun DetalleItem(
    title: String,
    descrip: String,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Text(
            text = title,
            modifier = Modifier.weight(1f),
            color = Color.Green,
            fontWeight = FontWeight.Medium
        )
        Text(text = descrip, modifier = Modifier.weight(2f), fontSize = 14.sp)


    }

}
