package com.jjmf.android.formeip.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjmf.android.formeip.ui.features.Formulario.FormularioScreen
import com.jjmf.android.formeip.ui.features.Menu.MenuScreen
import com.jjmf.android.formeip.ui.theme.FormEIPTheme

@Composable
fun NavegacionPrincipal() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Rutas.Menu.url){
        composable(Rutas.Menu.url){
            MenuScreen(
                toForm = {
                    navController.navigate(Rutas.Formulario.url)
                }
            )
        }
        composable(Rutas.Formulario.url){
            FormularioScreen()
        }

    }
}