package com.jjmf.android.escuelapastoral.ui.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jjmf.android.escuelapastoral.ui.theme.ColorP1

@Composable
fun CajaTexto(
    modifier: Modifier = Modifier,
    valor: String,
    newValor: (String) -> Unit,
    label: String? = null,
    placeholder:String? =null,
    leadingIcon: @Composable (()->Unit)? = null,
    trailingIcon: @Composable (()->Unit)? = null,
    keyboardType: KeyboardType = KeyboardType.Text,
) {

    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ){
        label?.let {
            Text(text = label)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, ColorP1, RoundedCornerShape(8.dp))
                .padding(10.dp),
            contentAlignment = Alignment.CenterStart
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(5.dp)
            ){
                leadingIcon?.let {
                    it()
                }
                Box(
                    modifier = Modifier.weight(1f),
                    contentAlignment = Alignment.CenterStart
                ){
                    if (valor.isEmpty()){
                        placeholder?.let {
                            Text(text = it, fontSize = 14.sp, color = Color.Gray)
                        }
                    }
                    BasicTextField(
                        value = valor,
                        onValueChange = newValor,
                        modifier = Modifier.fillMaxWidth(),
                        keyboardOptions = KeyboardOptions(
                            keyboardType = keyboardType
                        )
                    )
                }
                trailingIcon?.let {
                    it()
                }
            }
        }
    }

}