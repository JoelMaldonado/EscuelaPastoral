package com.jjmf.android.escuelapastoral.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jjmf.android.escuelapastoral.ui.features.Maestro.MenuMaestro.MenuMaestroScreen

fun  NavGraphBuilder.NavegacionMaestro(
    navController: NavHostController
) {
    composable(Rutas.Maestro.Menu.url){
        MenuMaestroScreen(
            toMarcarAsistencia = {
                navController.navigate(Rutas.Maestro.MarcarAsistencia.url)
            }
        )
    }

    composable(Rutas.Maestro.MarcarAsistencia.url){

    }
}