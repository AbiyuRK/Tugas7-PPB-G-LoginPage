package com.example.loginpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen(){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.a),
            contentDescription = "Login image",
            modifier = Modifier.size(200.dp)
        )

        Text(text = "Welcome Back")

        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Login to your account")

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = {
                Text(text = "Email address")
            },
            colors = OutlinedTextFieldDefaults.colors(Color.DarkGray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            visualTransformation = PasswordVisualTransformation(),
            label = {
                Text(text = "Password")
            },
            colors = OutlinedTextFieldDefaults.colors(Color.DarkGray)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { }) {
            Text(text = "Login")
        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Forgot Password?", modifier = Modifier.clickable {

        })

        Spacer(modifier = Modifier.height(32.dp))

        Text(text = "Or sign in with")

        Row(
            modifier = Modifier.fillMaxWidth().padding(40.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Image(
                painter = painterResource(id = R.drawable.fb),
                contentDescription = "Facebook",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Facebook clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.google),
                contentDescription = "Google",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Google clicked
                    }
            )

            Image(
                painter = painterResource(id = R.drawable.twitter),
                contentDescription = "Twitter",
                modifier = Modifier
                    .size(60.dp)
                    .clickable {
                        //Twitter clicked
                    }
            )
        }
    }
}
