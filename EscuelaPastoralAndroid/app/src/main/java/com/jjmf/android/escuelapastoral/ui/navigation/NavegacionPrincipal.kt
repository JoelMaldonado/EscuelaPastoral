package com.jjmf.android.escuelapastoral.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjmf.android.escuelapastoral.ui.features.Menu.MenuScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.AddEvent.AddEventScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.VerEventosScreen

@Composable
fun NavegacionPrincipal() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Rutas.Menu.url){
        composable(Rutas.Menu.url){
            MenuScreen(
                toEventos = {
                    navController.navigate(Rutas.Eventos.url)
                }
            )
        }

        composable(Rutas.Eventos.url){
            VerEventosScreen(
                toAddEvent = {
                    navController.navigate(Rutas.Eventos.AddEvent.url)
                }
            )
        }

        composable(Rutas.Eventos.AddEvent.url){
            AddEventScreen(
                back = {
                    navController.popBackStack()
                }
            )
        }
    }
}