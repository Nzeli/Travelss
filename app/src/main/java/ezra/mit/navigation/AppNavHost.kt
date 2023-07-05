package ezra.mit.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ezra.mit.ui.about.AboutScreen
import ezra.mit.ui.auth.AuthViewModel
import ezra.mit.ui.auth.LoginScreen
import ezra.mit.ui.auth.SignupScreen
import ezra.mit.ui.home.HomeScreen
import ezra.mit.ui.pages.BookNow
import ezra.mit.ui.pages.Hotels
import ezra.mit.ui.pages.Last
import ezra.mit.ui.pages.Payment

@Composable
fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(ROUTE_LOGIN) {
            LoginScreen(viewModel, navController)
        }
        composable(ROUTE_SIGNUP) {
            SignupScreen(viewModel, navController)
        }
        composable(ROUTE_HOME) {
            HomeScreen(viewModel, navController)
        }

        composable(ROUTE_ABOUT) {
            AboutScreen(viewModel, navController)
        }
        composable(ROUTE_HOTELS) {
            Hotels(viewModel, navController)
        }
        composable(ROUTE_BOOKNOW) {
            BookNow(viewModel, navController)
        }

        composable(ROUTE_PAYMENT) {
            Payment(viewModel, navController)
        }

        composable(ROUTE_LAST) {
            Last(viewModel, navController)
        }









    }
}