package net.ezra.navigation

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import net.ezra.ui.about.AboutScreen
import net.ezra.ui.auth.LoginScreen
import net.ezra.ui.auth.SignupScreen
import net.ezra.ui.dashboard.DashboardScreen
import net.ezra.ui.home.HomeScreen
import net.ezra.ui.mit.MitScreen
import net.ezra.ui.shop.ShopScreen
import net.ezra.ui.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_SPLASH


) {
    BackHandler {
        navController.popBackStack()

        }
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {


        composable(ROUTE_LOGIN) {
            LoginScreen(navController)
        }


        composable(ROUTE_SIGNUP) {
            SignupScreen(navController)
        }


        composable(ROUTE_HOME) {
            HomeScreen(navController)
        }


        composable(ROUTE_ABOUT) {
            AboutScreen(navController)
        }

        composable(ROUTE_MIT) {
            MitScreen(navController)
        }

        composable(ROUTE_SHOP) {
            ShopScreen(navController)
        }

        composable(ROUTE_DASHBOARD) {
            DashboardScreen(navController)
        }

        composable(ROUTE_SPLASH) {
            SplashScreen(navController)
        }
























    }
}