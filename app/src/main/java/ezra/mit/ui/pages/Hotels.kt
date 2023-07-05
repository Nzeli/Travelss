package ezra.mit.ui.pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_PAYMENT
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.spacing

@Composable
fun Hotels(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing



    Column(modifier = Modifier

        .fillMaxSize()
    ) {
        
    }

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {


        item {
            Column(
                modifier = Modifier
                    .fillMaxSize(),

                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text ="Enjoy your Stay in Luxury", fontSize = 25.sp,color=Color.Black)

            }

            Spacer(modifier =Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(8.dp),

                )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.lufthansa),
                        contentDescription ="new",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()

                    )
                    Text(text ="Lufthansa Hotel", fontSize = 20.sp, color = Color.Blue)
                    Spacer(modifier =Modifier.height(20.dp))
                    Text(text ="$450 per night", fontSize = 20.sp)
                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically

                    ) {

                        Button(onClick ={}) {

                            Text(text ="Book me",
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_PAYMENT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },

                            )
                        }
                    }

                }
            }




            }




        item {

            Spacer(modifier =Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(8.dp),

                )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(painter = painterResource(id = R.drawable.neww),
                        contentDescription ="hot",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()


                        )

                    Text(text = "Ekaa Hotel", fontSize = 20.sp,color = Color.Blue )
                    Spacer(modifier = Modifier.height(20.dp))



                    Text(text ="$500 per night", fontSize = 20.sp)

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        verticalAlignment = Alignment.CenterVertically

                    ) {
                        Button(onClick ={}) {

                            Text(text ="Book me",
                                modifier = Modifier
                                    .clickable {
                                        navController.navigate(ROUTE_PAYMENT) {
                                            popUpTo(ROUTE_HOME) { inclusive = true }
                                        }
                                    },

                                )
                        }




                    }

                }
            }




        }


        item {

            Spacer(modifier =Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(10.dp),
                elevation = CardDefaults.cardElevation(8.dp),

                )
            {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,

                ) {
                    Image(painter = painterResource(id = R.drawable.radison),
                        contentDescription ="hot",
                        contentScale = ContentScale.FillBounds,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                    Text(text = "Radison Hotel", fontSize = 20.sp, color = Color.Blue)

                    Spacer(modifier =Modifier.height(20.dp))

                    Text(text ="$600 per night", fontSize = 20.sp)

                }
                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Button(onClick ={}) {

                        Text(text ="Book me",
                                modifier = Modifier
                                .clickable {
                            navController.navigate(ROUTE_PAYMENT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                            
                        )

                    }
                }
            }

//            Button(onClick ={}) {
//
//                Text(text ="Next")
//            }
        }






        }



    }

























@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HotelsPreviewLight() {
   Hotels(null, rememberNavController())
}
