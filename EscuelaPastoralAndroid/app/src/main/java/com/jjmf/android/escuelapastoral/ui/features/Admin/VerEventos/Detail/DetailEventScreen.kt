package com.jjmf.android.escuelapastoral.ui.features.Admin.VerEventos.Detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.jjmf.android.escuelapastoral.ui.theme.Titulo
import com.jjmf.android.escuelapastoral.util.show

@Composable
fun DetailEventScreen(
    id:String,
    toVerMaestros:()->Unit,
    toVerSolicitudes:()->Unit,
    viewModel: DetailEventViewModel = hiltViewModel(),
) {


    LaunchedEffect(key1 = Unit){
        viewModel.init(id)
    }

    val context = LocalContext.current

    viewModel.error?.let {
        context.show(it)
        viewModel.error = null
    }

    val evento = viewModel.evento

    if (viewModel.cargando){
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
            CircularProgressIndicator()
        }
        return
    }

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
            descrip = "${evento?.titulo}"
        )
        DetalleItem(
            title = "Descripción",
            descrip = "${evento?.descrip}"
        )
        DetalleItem(
            title = "Pais",
            descrip = "${evento?.pais}"
        )
        DetalleItem(
            title = "Direccion",
            descrip = "${evento?.direc}"
        )
        DetalleItem(
            title = "Capacidad",
            descrip = "${evento?.cant}"
        )
        DetalleItem(
            title = "Fecha Inicio",
            descrip = "${evento?.toFecha(evento.fechaInicio, "dd/MM/yyyy")}"
        )
        DetalleItem(
            title = "Fecha Fin",
            descrip = "${evento?.toFecha(evento.fechaFin, "dd/MM/yyyy")}"
        )
        DetalleItem(
            title = "Costo",
            descrip = "S/${evento?.costo}"
        )
        DetalleItem(
            title = "Estado",
            descrip = "Culminado - Activo"
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
            onClick = toVerSolicitudes
        ) {
            Text(text = "Solicitudes")
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
