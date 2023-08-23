package com.jjmf.android.escuelapastoral.ui.features.VerEventos.VerMaestros

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
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.Detail.DetalleItem
import com.jjmf.android.escuelapastoral.ui.theme.Titulo

@Composable
fun VerMaestrosEventScreen(
    toDetail:()->Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Text(text = "Clases", style = Titulo)

        DetalleItem(
            title = "Efesios",
            descrip = "Ps. Adriel Albino",
            modifier = Modifier.clickable {
                toDetail()
            }
        )
        DetalleItem(title = "Nuevo Testamento", descrip = "Ps. Eli Tasayso")
        DetalleItem(title = "Antiguo Testamento", descrip = "Ps. Andrea Pachas")
    }
}