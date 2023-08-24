package com.jjmf.android.escuelapastoral.ui.features.VerEventos.Add

import android.app.DatePickerDialog
import android.widget.DatePicker
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Group
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.google.firebase.Timestamp
import com.jjmf.android.escuelapastoral.ui.components.CajaTexto
import com.jjmf.android.escuelapastoral.ui.theme.ColorP1
import com.jjmf.android.escuelapastoral.ui.theme.Titulo
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@Composable
fun AddEventScreen(
    back: () -> Unit,
    viewModel: AddEventViewModel = hiltViewModel(),
) {

    val context = LocalContext.current
    val year: Int
    val month: Int
    val day: Int

    val calendar = Calendar.getInstance()
    year = calendar.get(Calendar.YEAR)
    month = calendar.get(Calendar.MONTH)
    day = calendar.get(Calendar.DAY_OF_MONTH)
    calendar.time = Date()

    val fechaInicioDialog =
        DatePickerDialog(context, { date: DatePicker, _: Int, _: Int, _: Int ->
            viewModel.fechaInicio = date.toTimestamp()
        }, year, month, day)

    val fechaFinDialog =
        DatePickerDialog(context, { date: DatePicker, _: Int, _: Int, _: Int ->
            viewModel.fechaFin = date.toTimestamp()
        }, year, month, day)

    fechaInicioDialog.datePicker.minDate = System.currentTimeMillis()
    fechaFinDialog.datePicker.minDate = System.currentTimeMillis()

    if (viewModel.back) {
        LaunchedEffect(key1 = Unit) {
            back()
            viewModel.back = false
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = "Agregar Evento", style = Titulo)

        CajaTexto(
            valor = viewModel.titulo,
            newValor = {
                viewModel.titulo = it
            },
            label = "Titulo",
            placeholder = "Ingresa un título a tu evento"
        )
        CajaTexto(
            valor = viewModel.descrip,
            newValor = {
                viewModel.descrip = it
            },
            label = "Descripción",
            placeholder = "Ingresa una descripción a tu evento"
        )
        CajaTexto(
            valor = viewModel.pais,
            newValor = {
                viewModel.pais = it
            },
            label = "Pais",
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null,
                    tint = ColorP1
                )
            },
            placeholder = "Seleccion el pais donde sera el evento"
        )
        CajaTexto(
            valor = viewModel.direc,
            newValor = {
                viewModel.direc = it
            },
            label = "Dirección",
            placeholder = "Ingresa una dirección a tu evento"
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            CajaTexto(
                modifier = Modifier.weight(1f),
                valor = viewModel.fechaInicio.toText(),
                newValor = {},
                label = "Fecha Inicio",
                placeholder = "dd/mm/aaaa",
                trailingIcon = {
                    IconButton(
                        onClick = {
                            fechaInicioDialog.show()
                        }
                    ) {
                        Icon(imageVector = Icons.Default.CalendarMonth, contentDescription = null)
                    }
                }
            )
            CajaTexto(
                modifier = Modifier.weight(1f),
                valor = viewModel.fechaFin.toText(),
                newValor = {},
                label = "Fecha Final",
                placeholder = "dd/mm/aaaa",
                trailingIcon = {
                    IconButton(
                        onClick = {
                            fechaFinDialog.show()
                        }
                    ) {
                        Icon(imageVector = Icons.Default.CalendarMonth, contentDescription = null)
                    }
                }
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            CajaTexto(
                modifier = Modifier.weight(1f),
                valor = viewModel.cant,
                newValor = {
                    viewModel.cant = it
                },
                label = "Capacidad",
                keyboardType = KeyboardType.Number,
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Group,
                        contentDescription = null,
                        tint = ColorP1
                    )
                },
                placeholder = "0"
            )
            CajaTexto(
                modifier = Modifier.weight(1f),
                valor = viewModel.costo,
                newValor = { viewModel.costo = it },
                label = "Costo de inscrición",
                keyboardType = KeyboardType.Decimal,
                leadingIcon = {
                    Text(text = "S/")
                },
                placeholder = "0.0"
            )
        }

        Button(
            onClick = viewModel::save
        ) {
            Text(text = "Guardar")
        }
    }
}

private fun Timestamp?.toText() :String{
    return if (this!=null){
        val timestamp = this.toDate()
        val dateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.getDefault())
        dateFormat.format(timestamp)
    }else ""
}

private fun DatePicker.toTimestamp(): Timestamp {
    val year = year
    val month = month
    val day = dayOfMonth
    val calendar = Calendar.getInstance()
    calendar.set(year, month, day)
    return Timestamp(calendar.time)
}
