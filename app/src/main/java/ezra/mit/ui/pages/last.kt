package ezra.mit.ui.pages

import android.content.Intent
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
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.platform.LocalContext
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
import ezra.mit.navigation.ROUTE_HOME
import ezra.mit.navigation.ROUTE_HOTELS
import ezra.mit.navigation.ROUTE_LOGIN
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.theme.AppTheme
import ezra.mit.ui.theme.spacing

@Composable
fun Last(viewModel: AuthViewModel?, navController: NavHostController) {
    val spacing = MaterialTheme.spacing




    Box(modifier = Modifier) {


        Image(painter = painterResource(id =R.drawable.last),
            contentDescription = "last" ,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .fillMaxSize()


        )




    }






Column(
    modifier = Modifier
    .fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,

    ) {

    Text(text ="PAYMENT SUCCESSFUL", fontSize = 30.sp,color =  Color.White)



    Image(painter = painterResource(id =R.drawable.ttic),
        contentDescription = "hott",
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .size(80.dp)

    )

    Spacer(modifier = Modifier.height(60.dp))

    Text(text ="BON VOYAGE!!", fontSize = 30.sp, color = Color.White)
}



























}











































    @Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
    @Composable
    fun LastPreviewLight() {
        Last(null, rememberNavController())
    }