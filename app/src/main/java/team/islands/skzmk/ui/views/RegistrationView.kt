package team.islands.skzmk.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.rounded.ArrowForward
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import team.islands.skzmk.ui.theme.СКЗМКTheme

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Registration() {
    СКЗМКTheme {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Icon(
                imageVector = Icons.Filled.AccountBox,
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(bottom = 22.dp)
                    .size(96.dp)
            )

            Text(
                text = "Регистрация",
                fontWeight = FontWeight.Black,
                fontSize = 32.sp,
                modifier = Modifier.padding(bottom = 22.dp)
            )

            var mail by remember { mutableStateOf("") }
            OutlinedTextField(value = mail,
                onValueChange = { mail = it },
                label = { Text("Эл. почта") },
                singleLine = true,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(22.dp)
            )

            var name by remember { mutableStateOf("") }
            OutlinedTextField(value = name,
                onValueChange = { name = it },
                label = { Text("Фамилия И. О.") },
                singleLine = true,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 22.dp, end = 22.dp, bottom = 22.dp)
            )

            var password by rememberSaveable { mutableStateOf("") }
            var passwordVisible by rememberSaveable { mutableStateOf(false) }

            OutlinedTextField(value = password,
                onValueChange = { password = it },
                label = { Text("Пароль") },
                singleLine = true,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(start = 22.dp, end = 22.dp, bottom = 11.dp),
                visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                trailingIcon = {
                    val image = if (passwordVisible) Icons.Filled.Lock
                    else Icons.Outlined.Lock

                    val description = if (passwordVisible) "Hide password" else "Show password"

                    IconButton(onClick = { passwordVisible = !passwordVisible }) {
                        Icon(imageVector = image, description)
                    }
                })

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 58.dp, end = 58.dp)
            ) {
                Text(text = "ЗАРЕГИСТРИРОВАТЬСЯ")
            }

            OutlinedButton(
                onClick = { },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 22.dp, start = 58.dp, end = 58.dp)
            ) {
                Row {
                    Text(text = "ВХОД")
                    Icon(
                        imageVector = Icons.Rounded.ArrowForward,
                        contentDescription = null
                    )
                }
            }
        }
    }
}