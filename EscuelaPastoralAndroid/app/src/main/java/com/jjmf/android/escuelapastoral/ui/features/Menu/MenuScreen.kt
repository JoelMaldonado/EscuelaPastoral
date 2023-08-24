package com.jjmf.android.escuelapastoral.ui.features.Menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.compose.AsyncImage
import com.jjmf.android.escuelapastoral.R
import com.jjmf.android.escuelapastoral.ui.theme.ColorBlack
import com.jjmf.android.escuelapastoral.ui.theme.ColorP1

@Composable
fun MenuScreen(
    toEventos: () -> Unit,
    toCursos: () -> Unit,
    toUsuarios: () -> Unit,
    toPaises: () -> Unit,
    viewModel: MenuViewModel = hiltViewModel(),
) {

    LaunchedEffect(key1 = Unit) {
        viewModel.init()
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = buildAnnotatedString {
                        append("Bienvenido ")
                        withStyle(
                            style = SpanStyle(
                                color = ColorP1,
                                fontWeight = FontWeight.Medium
                            )
                        ) {
                            append("Joel")
                        }
                    },
                    color = ColorBlack,
                    fontSize = 18.sp
                )
                Text(text = "Pasando la Antorcha", color = ColorBlack, fontSize = 18.sp)
            }

            IconButton(
                onClick = {},
                modifier = Modifier
                    .clip(CircleShape)
                    .background(ColorP1)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Settings,
                    contentDescription = null,
                    tint = Color.White
                )
            }
        }

        Card(
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(150.dp),
                contentAlignment = Alignment.CenterStart
            ) {
                Image(
                    painter = painterResource(id = R.drawable.fondo_personas),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(ColorBlack.copy(0.6f))
                )
                Column(
                    modifier = Modifier.padding(start = 15.dp),
                    verticalArrangement = Arrangement.spacedBy(5.dp)
                ) {
                    Text(
                        text = "Nuestros Eventos",
                        color = Color.White,
                        fontWeight = FontWeight.Medium
                    )
                    Button(onClick = toEventos) {
                        Text(text = "Ver todos")
                    }
                }
            }

        }

        /**Usuarios**/
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Usuarios", fontSize = 18.sp, color = ColorBlack)
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                item {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .size(70.dp)
                                .clip(CircleShape)
                                .background(ColorP1)
                                .clickable {
                                    toUsuarios()
                                },
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                imageVector = Icons.Default.PersonAdd,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier.size(35.dp)
                            )
                        }
                        Text(text = "Agregar")
                    }
                }
                items(viewModel.list) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Image(
                            painter = painterResource(id = it.foto),
                            contentDescription = null,
                            modifier = Modifier
                                .size(70.dp)
                                .clip(CircleShape),
                            contentScale = ContentScale.Crop
                        )
                        Text(text = it.nombre)
                    }
                }
            }
        }

        /**Cursos**/
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Cursos", fontSize = 18.sp, color = ColorBlack)
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                items(viewModel.listCursos) {
                    Column (
                        modifier = Modifier
                            .width(180.dp)
                            .clickable { toCursos() },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        AsyncImage(
                            model = it.imagen,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = it.nombre,
                            color = ColorBlack,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 16.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

        /**Paises**/
        Column(
            verticalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            Text(text = "Países", fontSize = 18.sp, color = ColorBlack)
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(15.dp)
            ) {
                items(viewModel.listPaises) {
                    Column (
                        modifier = Modifier
                            .width(180.dp)
                            .clickable { toPaises() },
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        AsyncImage(
                            model = it.img,
                            contentDescription = null,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp),
                            contentScale = ContentScale.Crop
                        )
                        Text(
                            text = it.nombre,
                            color = ColorBlack,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Medium,
                            lineHeight = 16.sp,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }

    }
}