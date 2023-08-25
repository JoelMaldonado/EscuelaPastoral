package com.jjmf.android.escuelapastoral.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.jjmf.android.escuelapastoral.ui.features.Admin.Cursos.CursosScreen
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

fun NavGraphBuilder.NavegacionAdmin(navController: NavHostController){
    composable(Rutas.Admin.Menu.url) {
        MenuScreen(
            toEventos = {
                navController.navigate(Rutas.Admin.Eventos.url)
            },
            toCursos = {
                navController.navigate(Rutas.Admin.Cursos.url)
            },
            toUsuarios = {
                navController.navigate(Rutas.Admin.Usuarios.url)
            },
            toPaises = {
                navController.navigate(Rutas.Admin.Paises.url)
            }
        )
    }

    /**Eventos**/
    composable(Rutas.Admin.Eventos.url) {
        VerEventosScreen(
            toAddEvent = {
                navController.navigate(Rutas.Admin.Eventos.Add.url)
            },
            toDetalle = {
                navController.navigate(Rutas.Admin.Eventos.Detail.sendId(it))
            }
        )
    }

    composable(Rutas.Admin.Eventos.Add.url) {
        AddEventScreen(
            back = {
                navController.popBackStack()
            }
        )
    }

    composable(Rutas.Admin.Eventos.Detail.url) {
        it.arguments?.getString("id")?.let { id ->
            DetailEventScreen(
                id = id,
                toVerMaestros = {
                    navController.navigate(Rutas.Admin.Eventos.VerMaestros.url)
                },
                toVerSolicitudes = {
                    navController.navigate(Rutas.Admin.Eventos.VerSolicitudes.url)
                }
            )
        }
    }

    composable(Rutas.Admin.Eventos.VerSolicitudes.url) {
        VerSolicitudesEventScreen()
    }

    composable(Rutas.Admin.Eventos.VerMaestros.url) {
        VerMaestrosEventScreen(
            toDetail = {
                navController.navigate(Rutas.Admin.Eventos.VerMaestrosDetalle.url)
            }
        )
    }

    composable(Rutas.Admin.Eventos.VerMaestrosDetalle.url) {
        VerMaestrosDetailEventScreen()
    }

    /**Cursos**/
    composable(Rutas.Admin.Cursos.url) {
        CursosScreen()
    }

    /**Usuarios**/
    composable(Rutas.Admin.Usuarios.url) {
        UsuariosScreen(
            toAdd = {
                navController.navigate(Rutas.Admin.Usuarios.Add.url)
            }
        )
    }
    composable(Rutas.Admin.Usuarios.Add.url) {
        AddUsuarioScreen()
    }

    /**Paises**/
    composable(Rutas.Admin.Paises.url) {
        VerPaisesScreen()
    }
}