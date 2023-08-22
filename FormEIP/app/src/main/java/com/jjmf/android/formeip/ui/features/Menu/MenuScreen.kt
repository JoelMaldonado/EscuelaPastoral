package com.jjmf.android.formeip.ui.features.Menu

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    toForm:()->Unit,
    viewModel: MenuViewModel = hiltViewModel(),
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(text = "Inscripciones EIP", fontSize = 18.sp, fontWeight = FontWeight.SemiBold)

        TextField(
            value = viewModel.doc,
            onValueChange = { viewModel.doc = it },
            label = {
                Text(text = ("Ingresa tu Documento"))
            },
            modifier = Modifier.padding(vertical = 15.dp)
        )

        Button(
            onClick = toForm
        ) {
            Text(text = "Verificar")
        }
    }
}

