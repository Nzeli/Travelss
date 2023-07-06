package ezra.mit.ui.pages

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookNow(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing
    var text1 by remember { mutableStateOf(TextFieldValue("")) }
    var text2 by remember { mutableStateOf(TextFieldValue("")) }
    var text3 by remember { mutableStateOf(TextFieldValue("")) }
    var text4 by remember { mutableStateOf(TextFieldValue("")) }
    var text by remember { mutableStateOf(TextFieldValue("")) }


    Box(modifier = Modifier)

    {
        Image(painter = painterResource(id = R.drawable.book),
            contentDescription ="savv",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()
        )

    }

      LazyColumn(

          modifier = Modifier
              .fillMaxSize()

      ) {item {
          Text(text ="Book your", fontSize = 60.sp,fontFamily = FontFamily.Cursive)
          Text(text ="Flight", fontSize = 60.sp, fontFamily = FontFamily.Cursive)

          Spacer(modifier =Modifier.height(60.dp))

          LazyRow(
              modifier = Modifier
                  .fillMaxWidth()
          ) {
              item {
                  Card( modifier = Modifier
                      .padding(10.dp)
                      .fillMaxWidth(),

                      elevation = CardDefaults.cardElevation(8.dp)
                  ) {

                      Text(
                          text = "First Class",
                          fontSize = 25.sp,
                          fontFamily = FontFamily.SansSerif
                      )


                      Column() {
                          Image(painter = painterResource(id =R.drawable.one),
                              contentDescription ="first"
                          )
                          Text(text ="Starting from", fontSize = 20.sp)
                          Text(text ="kes 200,000 per person",fontSize = 20.sp)
                          
                      }


                  }
              }

              item {


                  Card(
                      modifier = Modifier
                          .padding(10.dp)
                          .fillMaxWidth(),

                      elevation = CardDefaults.cardElevation(8.dp)
                  ) {

                      Text(
                          text = "Economy Class",
                          fontSize = 25.sp,
                          fontFamily = FontFamily.SansSerif
                      )
                      Column( ) {
                          Image(painter = painterResource(id =R.drawable.five),
                              contentDescription ="second",

                          )
                          Text(text ="Starting from", fontSize = 20.sp)
                          Text(text ="kes 50,000 per person",fontSize = 20.sp)

                      }

                  }

              }
              item {

                  Card(
                      modifier = Modifier
                          .padding(10.dp)
                          .fillMaxWidth(),

                      elevation = CardDefaults.cardElevation(8.dp)
                  ) {
                      Text(
                          text = "Business Class",
                          fontSize = 25.sp,
                          fontFamily = FontFamily.SansSerif
                      )
                      Column( ) {
                          Image(painter = painterResource(id =R.drawable.bzn),
                              contentDescription ="second",

                          )
                          Text(text ="Starting from", fontSize = 20.sp)
                          Text(text ="kes80,000 per person",fontSize = 20.sp)


                      }

                  }



              }
          }


          Spacer(modifier = Modifier.height(40.dp))




          TextField(
              value = text,
              onValueChange = {
                  text = it
              },
              label = { Text(text = "FROM:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(40.dp))





          TextField(
              value = text1,
              onValueChange = {
                  text1 = it
              },
              label = { Text(text = "TO:", fontSize = 20.sp)},

          )
          Spacer(modifier =Modifier.height(40.dp))

          TextField(
              value = text2,
              onValueChange = {
                  text2 = it
              },
              label = { Text(text = "NO.OF DAYS:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(40.dp))

          TextField(
              value = text3,
              onValueChange = {
                  text3 = it
              },
              label = { Text(text = " FLIGHT CLASS:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(40.dp))
          TextField(
              value = text4,
              onValueChange = {
                  text4 = it
              },
              label = { Text(text = "PASSENGERS:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(60.dp))

          Button(onClick ={},
              modifier = Modifier
                  .width(160.dp)





          ) {

              Text(text ="PAY",
                  modifier = Modifier
                      .clickable {
                          navController.navigate(ROUTE_PAYMENT) {
                              popUpTo(ROUTE_HOME) { inclusive = true }
                          }
                      },
                  fontSize = 20.sp

                  )
          }




      }
}
























}




@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun BookNow() {
    BookNow(null, rememberNavController())
}