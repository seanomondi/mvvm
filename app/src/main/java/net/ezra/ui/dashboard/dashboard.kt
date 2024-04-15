package net.ezra.ui.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_DASHBOARD
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SHOP

@Composable
fun DashboardScreen(navController: NavHostController) {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        item {

            Row(
                modifier = Modifier
                    .background(color = Color(0xffFFD700))
                    .height(50.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {
                Text(text = "DASHBOARD")

                Icon(imageVector = Icons.Default.Notifications,
                    contentDescription = "",
                    Modifier.background(color = Color(0xff4169E1))
                )

            }


            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .size(150.dp),
                    colors = CardDefaults.cardColors(Color(0xffB0C4DE))
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(imageVector = Icons.Default.Info, contentDescription = "")
                        Text(text = "    786")
                        Text(text = "    Total Units in Stock")
                    }
                }

                Spacer(modifier = Modifier.width(20.dp))

                Card(
                    modifier = Modifier
                        .size(150.dp),
                    colors = CardDefaults.cardColors(Color(0xffFFFACD))
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Icon(imageVector = Icons.Default.CheckCircle, contentDescription = "")
                        Text(text = "    $565,430.00")
                        Text(text = "    Total Inventory Value")
                    }
                }

            }
            
            Spacer(modifier = Modifier.height(20.dp))

            Row {
                Text(text = "Inventory")
            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(80.dp)
                    .background(color = Color(0xffB0C4DE)),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(text = "No. of Tires")
                    Text(text = "486")

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_SHOP) {
                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
                                }
                            },
                        text = "View Stock ->",
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }
                
                Column {
                    Text(text = "Reorder level")
                    Text(text = "1/12")
                    
                }

            }

            Spacer(modifier = Modifier.height(20.dp))

            Row(
                modifier = Modifier
                    .background(color = Color(0xffFFFACD))
                    .height(80.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(text = "No. of Wheels")
                    Text(text = "300")

                    Text(
                        modifier = Modifier

                            .clickable {
                                navController.navigate(ROUTE_SHOP) {
                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
                                }
                            },
                        text = "View Stock ->",
                        color = MaterialTheme.colorScheme.onSurface
                    )
                }


                Column {
                    Text(text = "Reorder level")
                    Text(text = "2/14")

                }

            }

            Spacer(modifier = Modifier.height(20.dp))


            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier
                        .background(Color.Black)

                        .clickable {
                            navController.navigate(ROUTE_SHOP) {
                                popUpTo(ROUTE_DASHBOARD) { inclusive = true }
                            }
                        },
                    text = "ADD STOCK",
                    color = Color.White
                )
            }


//            Row(
//                modifier = Modifier
//                    .background(color = Color(0xffFFD700))
//                    .height(50.dp)
//                    .fillMaxWidth(),
//                horizontalArrangement = Arrangement.Absolute.SpaceEvenly
//            ) {
//
//                Column(
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Home,
//                        contentDescription = ""
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_DASHBOARD) {
//                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
//                                }
//                            },
//                        text = "Home",
////                           color = Color(0xffBB86FC),
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//                }
//
//                Column(
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Build,
//                        contentDescription = ""
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_ABOUT) {
//                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
//                                }
//                            },
//                        text = "Inventory",
////                           color = Color(0xffBB86FC),
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//                }
//
//                Column(
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Settings,
//                        contentDescription = ""
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_MIT) {
//                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
//                                }
//                            },
//                        text = "Settings",
////                            textAlign = TextAlign.Center,
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//                }
//
//                Column(
//                    verticalArrangement = Arrangement.Center
//                ) {
//                    Icon(
//                        imageVector = Icons.Default.Person,
//                        contentDescription = ""
//                    )
//
//                    Text(
//                        modifier = Modifier
//
//                            .clickable {
//                                navController.navigate(ROUTE_SHOP) {
//                                    popUpTo(ROUTE_DASHBOARD) { inclusive = true }
//                                }
//                            },
//                        text = "Account",
//                        color = MaterialTheme.colorScheme.onSurface
//                    )
//                }
//            }
        }
    }




}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    DashboardScreen(rememberNavController())
}

