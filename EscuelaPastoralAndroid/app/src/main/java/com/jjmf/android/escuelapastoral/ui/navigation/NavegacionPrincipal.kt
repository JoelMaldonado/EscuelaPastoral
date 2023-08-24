package com.jjmf.android.escuelapastoral.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.jjmf.android.escuelapastoral.ui.features.Cursos.CursosScreen
import com.jjmf.android.escuelapastoral.ui.features.Menu.MenuScreen
import com.jjmf.android.escuelapastoral.ui.features.Paises.VerPaisesScreen
import com.jjmf.android.escuelapastoral.ui.features.Usuarios.AddUsuario.AddUsuarioScreen
import com.jjmf.android.escuelapastoral.ui.features.Usuarios.UsuariosScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.Add.AddEventScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.Detail.DetailEventScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.Solicitudes.VerSolicitudesEventScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.VerEventosScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.VerMaestros.VerMaestrosEventScreen
import com.jjmf.android.escuelapastoral.ui.features.VerEventos.VerMaestrosDetail.VerMaestrosDetailEventScreen

@Composable
fun NavegacionPrincipal() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Rutas.Menu.url){
        composable(Rutas.Menu.url){
            MenuScreen(
                toEventos = {
                    navController.navigate(Rutas.Eventos.url)
                },
                toCursos = {
                    navController.navigate(Rutas.Cursos.url)
                },
                toUsuarios = {
                    navController.navigate(Rutas.Usuarios.url)
                },
                toPaises = {
                    navController.navigate(Rutas.Paises.url)
                }
            )
        }

        /**Eventos**/
        composable(Rutas.Eventos.url){
            VerEventosScreen(
                toAddEvent = {
                    navController.navigate(Rutas.Eventos.Add.url)
                },
                toDetalle = {
                    navController.navigate(Rutas.Eventos.Detail.url)
                }
            )
        }

        composable(Rutas.Eventos.Add.url){
            AddEventScreen(
                back = {
                    navController.popBackStack()
                }
            )
        }

        composable(Rutas.Eventos.Detail.url){
            DetailEventScreen(
                toVerMaestros = {
                    navController.navigate(Rutas.Eventos.VerMaestros.url)
                },
                toVerSolicitudes = {
                    navController.navigate(Rutas.Eventos.VerSolicitudes.url)
                }
            )
        }

        composable(Rutas.Eventos.VerSolicitudes.url){
            VerSolicitudesEventScreen()
        }

        composable(Rutas.Eventos.VerMaestros.url){
            VerMaestrosEventScreen(
                toDetail = {
                    navController.navigate(Rutas.Eventos.VerMaestrosDetalle.url)
                }
            )
        }

        composable(Rutas.Eventos.VerMaestrosDetalle.url){
            VerMaestrosDetailEventScreen()
        }

        /**Cursos**/
        composable(Rutas.Cursos.url){
            CursosScreen()
        }

        /**Usuarios**/
        composable(Rutas.Usuarios.url){
            UsuariosScreen(
                toAdd = {
                    navController.navigate(Rutas.Usuarios.Add.url)
                }
            )
        }
        composable(Rutas.Usuarios.Add.url){
            AddUsuarioScreen()
        }

        /**Paises**/
        composable(Rutas.Paises.url){
            VerPaisesScreen()
        }
    }
}