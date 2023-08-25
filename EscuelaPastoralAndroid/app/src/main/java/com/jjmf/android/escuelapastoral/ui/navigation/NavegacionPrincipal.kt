package com.jjmf.android.escuelapastoral.ui.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavegacionPrincipal() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "pregunta") {
        composable("pregunta") {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(
                    onClick = {
                        navController.navigate(Rutas.Admin.Menu.url)
                    }
                ) {
                    Text(text = "Admin")
                }
                Button(
                    onClick = {
                        navController.navigate(Rutas.Maestro.Menu.url)
                    }
                ) {
                    Text(text = "Maestro")
                }
            }
        }

        NavegacionMaestro(
            navController = navController
        )
        NavegacionAdmin(
            navController = navController
        )

    }
}