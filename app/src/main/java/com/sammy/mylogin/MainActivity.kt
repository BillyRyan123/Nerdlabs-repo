package com.sammy.mylogin

import android.graphics.drawable.PaintDrawable
import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.Alignment.Companion.TopCenter
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
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
        modifier = Modifier.fillMaxSize()
            .background(Color.White),
       // verticalArrangement= Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){//Start of column

        Box(
            modifier= Modifier
                .align(Alignment.End)
                .padding(32.dp)
        ){// start of this box
            Button(onClick = { /*TODO*/ },
                modifier=Modifier
                    .border(
                        border = BorderStroke(1.dp, Color.Gray), // Outline border color and thickness
                        shape = MaterialTheme.shapes.medium
                    ),
                elevation = null,
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF))
                ) {
              Text(text = "English",
                  color=Color.Black

              )
                Icon(Icons.Default.ArrowDropDown, contentDescription = "",
                    tint = Color.Black)
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
            modifier=Modifier.background(Color.White)
            .fillMaxSize(),
            verticalArrangement= Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Text(text = "Login",
                style= TextStyle(fontSize = 28.sp, fontWeight= FontWeight.Bold)
            )
            Text(text = "You must login to your \n account to continue")
             Spacer(modifier = Modifier.height(64.dp))

            Spacer(modifier = Modifier.height(16.dp))
             NewComp("E-Mail")
             NewComp("Password")

             Spacer(modifier = Modifier.height(16.dp))

            Spacer(modifier = Modifier.height(8.dp))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFD700)),
                shape = RoundedCornerShape(8.dp),
                modifier = Modifier
                    .width(300.dp)
                    .height(64.dp),
                contentPadding = PaddingValues(vertical = 4.dp)
            ) {
                Box(modifier = Modifier.padding(16.dp)) { // Add padding inside the button
                    Text(
                        text = "Login",
                        color = Color.White ,
                        fontSize = 18.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {// Start of row
                    Text(text="Remember me")
                Spacer(modifier = Modifier.height(16 .dp))
                    Text(text="Forgot Password?")

            }// end of row
            Text(text = "or" )
            Spacer(modifier = Modifier.height(16.dp))
           Column (
               verticalArrangement = Arrangement.Bottom,
               horizontalAlignment = Alignment.CenterHorizontally
           ){
               Row{
                   Button(onClick = { /*TODO*/ },
                       modifier= Modifier
                           .width(120.dp)
                           .border(
                               border = BorderStroke(
                                   1.dp,
                                   Color.Gray
                               ),
                               shape = MaterialTheme.shapes.medium
                           ),
                       elevation = null,
                       colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF))

                       ) {
                            // Google icon
                      Row (
                         modifier= Modifier.fillMaxWidth(),
                          verticalAlignment = Alignment.CenterVertically,
                          horizontalArrangement = Arrangement.Center
                      ){
                          Icon(painter = painterResource(id = R.drawable.google_icon),
                              contentDescription = "Google Image",
                              tint = Color.Unspecified,
                              modifier = Modifier.size(24.dp)
                              )
                      }

                   }
                   Spacer(modifier = Modifier.width(8.dp))
                   Button(onClick = { /*TODO*/ },
                       modifier= Modifier
                           .width(120.dp)
                           .border(
                               border = BorderStroke(
                                   1.dp,
                                   Color.Gray
                               ), // Outline border color and thickness
                               shape = MaterialTheme.shapes.medium
                           ),
                       elevation = null,
                       colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFFFFFF))

                       ) {
                       Row (
                           modifier= Modifier.fillMaxWidth(),
                           verticalAlignment = Alignment.CenterVertically,
                           horizontalArrangement = Arrangement.Center
                       ){
                           Icon(painter = painterResource(id = R.drawable.apple_icon),
                               contentDescription = "Apple image",
                               tint = Color.Unspecified,
                               modifier = Modifier.size(24.dp))
                       }
                   }
               }
               Spacer(modifier = Modifier.height(16.dp))
               Column {
                   Text(text = "Not Registered, Register")
               }
               Spacer(modifier = Modifier.height(16.dp))
           }

        }

    }//End of column
    Spacer(modifier = Modifier.height(16.dp))

}//End of function

@Composable
fun NewComp(title:String){
    Column {
        Text(text = title,

            )
        OutlinedTextField(value = "", onValueChange = {},
            label = { Text("Enter email") },
            modifier=Modifier
                .width(300.dp)
                .height(60.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyLoginPreview(){
    MyLogin()
}


