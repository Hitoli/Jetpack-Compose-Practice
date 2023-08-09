package com.example.netclantest

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.netclantest.ui.theme.NetclanTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NetclanTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Navbar()
                }
            }
        }
    }
}

@Composable
fun Homescreen(){
    LazyColumn(modifier = Modifier.padding(5.dp)){

        item {
            ExploreScreen()
            ExploreScreen()
            ExploreScreen()
            ExploreScreen()
            ExploreScreen()

        }
    }
}

@Composable
fun ExploreScreen( ){
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(20.dp)){

        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.White), elevation = 10.dp, shape = RoundedCornerShape(20.dp)
        ) {

            Column(modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.Start) {
                Row(modifier = Modifier) {
                    Column(modifier = Modifier.offset(x = 80.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
                        Text(text = "Hitesh Kohli", modifier = Modifier.padding(2.dp), style = MaterialTheme.typography.body1)
                        Text(text = "Lucknow | Internee", modifier = Modifier.padding(2.dp), style = MaterialTheme.typography.body1)
                        Text(text = "Within 600 - 700m", modifier = Modifier.padding(2.dp), style = MaterialTheme.typography.body1)
                    }
                }
                Text(text = "Coffee | Buisness | Friendship", modifier = Modifier.padding(2.dp), style = MaterialTheme.typography.body1)
                Text(text = "Hi, Community! I am open to new connections", modifier = Modifier.padding(2.dp), style = MaterialTheme.typography.body1)

            }
       }

       Card(modifier = Modifier
           .offset(y = 0.dp, x = -10.dp)
           .width(100.dp), shape = RoundedCornerShape(20.dp)) {
           Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null, modifier = Modifier)
       }


    }
}

@Composable
fun topBarNav() {
    TopAppBar(
        title = {
            Text(text = "Home")
        }, navigationIcon = {
            IconButton(onClick = {  }) {
                Icon(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = null)
            }
        }, backgroundColor = Color.Gray
    )


}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Navbar() {
    Scaffold(
        topBar ={ topBarNav()}
    ) {
        Homescreen()
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NetclanTestTheme {
        ExploreScreen()
    }
}