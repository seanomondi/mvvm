package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.R

@Composable
fun HomeScreen(navController: NavHostController) {

    Box {
        Image(
            painter = painterResource(id = R.drawable.homepage),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.LightGray)
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            item {

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.1")
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.2")
                        }
                    }

                }

                Spacer(modifier = Modifier.height(30.dp))


                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.3")
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.4")
                        }

                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.5")
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.6")
                        }

                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.7")
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.8")
                        }

                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Row(
                    modifier = Modifier
                        .padding(10.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.9")
                        }
                    }

                    Spacer(modifier = Modifier.width(20.dp))

                    Card {
                        Image(
                            painter = painterResource(id = R.drawable.homepage),
                            contentDescription = "",
                            Modifier.size(150.dp)
                        )
                        Column {
                            Text(text = "    Card No.10")
                        }

                    }
                }




                Spacer(modifier = Modifier.height(100.dp))

                Row(
                    modifier = Modifier
                        .background(Color.LightGray)
                        .height(50.dp)
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Absolute.SpaceEvenly
                ) {
                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Menu,
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "about",
//                           color = Color(0xffBB86FC),
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_MIT) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "  mit",
//                            textAlign = TextAlign.Center,
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }

                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = ""
                        )

                        Text(
                            modifier = Modifier

                                .clickable {
                                    navController.navigate(ROUTE_SHOP) {
                                        popUpTo(ROUTE_HOME) { inclusive = true }
                                    }
                                },
                            text = "shop",
                            color = MaterialTheme.colorScheme.onSurface
                        )
                    }
                }


            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

