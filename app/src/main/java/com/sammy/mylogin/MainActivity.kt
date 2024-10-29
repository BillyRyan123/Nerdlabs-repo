package com.sammy.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sammy.mylogin.ui.theme.MyLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyLogin()
                }
            }
        }
    }
}

@Composable
fun MyLogin(){// Start of Function
    Column (
        modifier = Modifier.fillMaxSize(),
       // verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){//Start of column
        Box(
            modifier= Modifier
                .align(Alignment.End)
                .padding(32.dp)
        ){// start of this box
            Button(onClick = { /*TODO*/ }) {
              Text(text = "English",
                  color=Color.Black

              )
                Icon(Icons.Default.ArrowDropDown, contentDescription = "")
            }
            DropdownMenu(expanded = false , onDismissRequest = { /*TODO*/ }) {
                DropdownMenuItem(
                    text = { Text(text = "French") },
                    onClick = { /*TODO*/ }
                )

                DropdownMenuItem(
                    text = { Text(text = "Spanish") },
                    onClick = { /*TODO*/ }
                )
            }
        }//end of this box
        Column(
            modifier= Modifier.fillMaxSize(),
            verticalArrangement= Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){

            // Spacer(modifier = Modifier.height(128.dp))
            Text(text = "Login",
                style= TextStyle(fontSize = 20.sp, fontWeight= FontWeight.Bold)
            )
            Text(text = "You must login to your account to continue")
            Spacer(modifier = Modifier.height(16.dp))
             NewComp("E-Mail")
             NewComp("Password")

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .width(302.dp)
                    .padding(vertical = 8.dp, horizontal = 16.dp)
                ,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD700))
            ) {
                Box(modifier = Modifier.padding(16.dp)) { // Add padding inside the button
                    Text(
                        text = "login",
                        color = Color.White // Set text color to white
                    )
                }
            }
            Row {// Start of row
                Box {
                    Text(text="Remember me")
                }
                Spacer(modifier = Modifier.height(16.dp))
                Box{
                    Text(text="Forgot Password?")
                }

            }// end of row

            Row{
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Google")
                }
                Spacer(modifier = Modifier.width(16.dp))
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "FB")
                }
            }

            Text(text = "or" )

        }
    }//End of column

}//End of function

@Composable
fun NewComp(title:String){
    Column {
        Text(text = title,

            )
        OutlinedTextField(value = "", onValueChange = {})
    }
}

@Preview(showBackground = true)
@Composable
fun MyLoginPreview(){
    MyLogin()
}