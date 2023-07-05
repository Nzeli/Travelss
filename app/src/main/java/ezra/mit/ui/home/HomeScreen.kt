package ezra.mit.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_BOOKNOW
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_HOTELS
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_PAYMENT
import ezra.mit.navigation.ROUTE_SIGNUP
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing

@Composable
fun HomeScreen(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing


    Box(modifier = Modifier)

    {

        Image(painter = painterResource(id = R.drawable.saff),
            contentDescription ="savv",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()


        )

    }







    Column(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(spacing.medium)
            .padding(top = spacing.extraLarge),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            "Discover the world  with us!",
            style = MaterialTheme.typography.headlineSmall,
            color = Color.Black
        )




        Spacer(modifier = Modifier.height(20.dp))



        Spacer(modifier =Modifier.height(20.dp))


        Row(modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement  =  Arrangement.SpaceEvenly) {

            Column() {
                Image(painter = painterResource(id = R.drawable.aero),
                    contentDescription ="sign",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(50.dp)
//                    .clip(RectangleShape) // clip to the circle shape
                        .border(2.dp, Color.Black, RoundedCornerShape(10.dp))//optional
                )

                Spacer(modifier =Modifier.height(10.dp))
                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_BOOKNOW) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Flights",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }



            Column {

                Image(painter = painterResource(id = R.drawable.hotel),
                contentDescription ="hot",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .size(50.dp)
                    .border(2.dp, Color.Black, RoundedCornerShape(10.dp))//optional
            )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_HOTELS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Hotels",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontSize = 20.sp
                )

                
            }

            Column() {
                Image(painter = painterResource(id = R.drawable.payy),
                    contentDescription ="hot",
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .size(50.dp)
                        .border(2.dp, Color.Black, RoundedCornerShape(10.dp))//optional
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    modifier = Modifier
                        .clickable {
                            navController.navigate(ROUTE_PAYMENT) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }
                        },
                    text = "Payment",
                    style = MaterialTheme.typography.bodyLarge,
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }





        }
     Spacer(modifier = Modifier.height(20.dp))


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(spacing.medium)




        ) {


            Spacer(modifier = Modifier.height(30.dp))

            Row(
            ) {

                Text(text ="Popular Destinations",color = Color.Black, fontSize = 40.sp, fontFamily =FontFamily.Cursive)



            }

            LazyColumn(
                modifier = Modifier.fillMaxWidth()
            ) {


                item {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .padding(vertical = 25.dp),
                        verticalArrangement  = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {


                       Card(
                           modifier = Modifier
                               .padding(10.dp)
                               .fillMaxWidth(),

                           elevation = CardDefaults.cardElevation(8.dp)

                       ) {
//




                           Text(text ="Malibu", fontSize = 20.sp, fontFamily = FontFamily.SansSerif)

                           Column() {
                               Image(
                                   painter = painterResource(id = R.drawable.mali),
                                   contentDescription = "telav",
                                   contentScale = ContentScale.FillBounds,
                                   modifier = Modifier
                                       .fillMaxWidth()
                               )
                               Spacer(modifier = Modifier.height(20.dp))
                               

                               Spacer(modifier = Modifier.width(10.dp))




                           }



                       }



                    }





                }




                item {


                       Card(
                           modifier = Modifier
                               .padding(10.dp)
                               .fillMaxWidth(),
                           shape = RoundedCornerShape(10.dp),
                           elevation = CardDefaults.cardElevation(8.dp),


                       ) {


                           Text(text ="Tokyo", fontSize = 20.sp)

                           Column(
                               horizontalAlignment = Alignment.CenterHorizontally,
                           ) {


                               Image(
                                   painter = painterResource(id = R.drawable.japp),
                                   contentDescription = "telav",
                                   contentScale = ContentScale.FillBounds,
                                   modifier = Modifier
                                       .fillMaxWidth()


                               )
                               Spacer(modifier = Modifier.width(5.dp))

                               Column() {




                               }

                           }


                       }



                }


                item{


                    Card(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(10.dp),
                        elevation = CardDefaults.cardElevation(8.dp),


                        ) {
//

                        Text(text ="Tokyo", fontSize = 20.sp)

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                        ) {


                            Image(
                                painter = painterResource(id = R.drawable.egypt),
                                contentDescription = "egypt",
                                contentScale = ContentScale.FillBounds,
                                modifier = Modifier
                                    .fillMaxWidth()


                            )
                            Spacer(modifier = Modifier.width(5.dp))

                            Column() {




                            }

                        }


                    }



                }














            }





            Button(
                onClick = {
                    viewModel?.logout()
                    navController.navigate(ROUTE_LOGIN) {
                        popUpTo(ROUTE_HOME) { inclusive = true }
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = spacing.extraLarge)
            ) {
                Text(text = "Logout")
            }
        }














            }

        }







@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    HomeScreen(null, rememberNavController())
}

