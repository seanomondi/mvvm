package net.ezra.ui.shop

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun ShopScreen(navController: NavHostController) {

    Column(
        modifier = Modifier
            .background(Color.White)
            .fillMaxSize()
            .wrapContentHeight()
            .padding(10.dp)
            .padding(top = 10.dp)

    ){

        Text(text = "Shop Screen")

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }
                },
            text = "home",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_ABOUT) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }
                },
            text = "about",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier

                .clickable {
                    navController.navigate(ROUTE_MIT) {
                        popUpTo(ROUTE_SHOP) { inclusive = true }
                    }
                },
            text = "mit",
            textAlign = TextAlign.Center,
            color = MaterialTheme.colorScheme.onSurface
        )




    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ShopScreen(rememberNavController())
}

