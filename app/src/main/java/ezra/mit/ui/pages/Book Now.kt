package ezra.mit.ui.pages

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.Dimension
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import ezra.mit.R
import ezra.mit.navigation.ROUTE_BOOKNOW
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.navigation.ROUTE_PAYMENT
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BookNow(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing
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
          Text(text ="Book your", fontSize = 40.sp)
          Text(text ="Flight", fontSize = 40.sp)


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
              value = text,
              onValueChange = {
                  text = it
              },
              label = { Text(text = "TO:", fontSize = 20.sp)},

          )
          Spacer(modifier =Modifier.height(40.dp))

          TextField(
              value = text,
              onValueChange = {
                  text = it
              },
              label = { Text(text = "NO.OF DAYS:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(40.dp))

          TextField(
              value = text,
              onValueChange = {
                  text = it
              },
              label = { Text(text = " FLIGHT CLASS:", fontSize = 20.sp) },

          )
          Spacer(modifier =Modifier.height(40.dp))
          TextField(
              value = text,
              onValueChange = {
                  text = it
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