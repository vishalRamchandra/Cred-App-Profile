package com.example.profileactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.surfaceColorAtElevation
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profileactivity.ui.theme.ProfileActivityTheme
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileActivityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Interface(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Interface( modifier: Modifier) {
    Column(modifier = Modifier.fillMaxSize()) {
        // first block
        Column( modifier = Modifier
            .weight(6f)
            .background(color = Color(0xFF121212))
            .fillMaxSize()
            .padding(start = 24.dp, end = 15.dp, top = 12.dp)) {
            // back and support buttons
            Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 40.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(painter = painterResource(R.drawable.left_arrow_svgrepo_com), contentDescription = "back", modifier = Modifier
                        .size(40.dp)
                        .padding(end = 5.dp), tint = Color.White)
                    Text( text = "Profile", fontWeight = FontWeight.Bold, color = Color.White, textAlign = TextAlign.Center, )
                }
                Surface(modifier = Modifier.border(BorderStroke(.5.dp, color = Color.Gray), shape = RoundedCornerShape(165.dp)), color= Color(0xFF121212)) {
                    Row(modifier = Modifier.padding(start = 15.dp, end = 15.dp, top = 8.dp, bottom = 8.dp)) { Icon( painter = painterResource(R.drawable.sms), contentDescription = "support", modifier = Modifier
                        .size(25.dp)
                        .padding(end = 5.dp), tint = Color.Gray )
                        Text(text = "support", fontFamily = FontFamily.SansSerif, color = Color.LightGray, fontSize = 10.sp) }
                }
            }
            // edit profile
            Row(horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 20.dp) ) {
                // image and name
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Image(
                        painter = painterResource(R.drawable.vishal_photo),
                        contentDescription = "profile photo",
                        modifier = Modifier
                            .size(65.dp)
                            .clip(CircleShape)
                            .padding(0.dp), contentScale = ContentScale.Crop
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier) {
                        Text( text = "Vishal R", fontWeight = FontWeight.Bold, color = Color.White, fontSize = 15.sp )
                        Text(text = "member since Dec, 2020", fontSize = 15.sp, color = Color.LightGray )
                    }
                }
                Icon(
                    painter = painterResource(R.drawable.pencil_svgrepo_com__1_),
                    tint = Color.Gray,
                    contentDescription = "edit",
                    modifier = Modifier
                        .size(45.dp)
                        .border(BorderStroke(.5.dp, color = Color.Gray), shape = CircleShape)
                        .padding(5.dp),
                )
            }
           Surface(modifier = Modifier
               .fillMaxWidth()
               .background(color = Color.Black)
               .border(BorderStroke(.5.dp, color = Color.Gray), shape = RectangleShape)
               .padding(20.dp), color = Color.Black ) {
                Row ( verticalAlignment = Alignment.CenterVertically, modifier = Modifier) {
                    Image( painter = painterResource(R.drawable.car_), contentDescription = "vehicle", modifier = Modifier
                        .size(35.dp)
                        .border(BorderStroke(.5.dp, color = Color.Gray), shape = CircleShape)
                        .padding(5.dp))
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier) { Text( text = "get to know your vehicles, inside out", color = Color.LightGray, fontSize = 13.sp)
                        Row (verticalAlignment = Alignment.CenterVertically){ Text( text = "CRED garage", color = Color.White, fontSize = 15.sp)
                            Icon(painter = painterResource(R.drawable.left_arrow_svgrepo_com), contentDescription = "forward", modifier = Modifier
                                .size(35.dp)
                                .padding(start = 5.dp)
                                .graphicsLayer { rotationY = 180f }, tint = Color.White)
                        }
                    }
                }
            }
            // category 1 -> Credit Score check
            Row( horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth().padding(top = 30.dp)) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.currency_rupee),
                        contentDescription = "score",
                        tint = Color.Gray,
                        modifier = Modifier.size(20.dp).border(BorderStroke(.3.dp, color = Color.Gray), shape = CircleShape).padding(2.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Row {
                        Text(text = "credit score ", color = Color.LightGray, fontSize = 14.sp)
                        Text(text = ". REFRESH AVAILABLE", color = Color.Green, fontSize = 14.sp)
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) { Text( text = "757", color = Color.White, fontSize = 14.sp)
                    Icon(painter = painterResource(R.drawable.left_arrow_svgrepo_com), contentDescription = "forward", modifier = Modifier
                        .size(35.dp)
                        .padding(start = 5.dp).graphicsLayer { rotationY = 180f }, tint = Color.White)
                }
            }
            HorizontalDivider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

            // category 2 -> lifetime cashback check
            Row( horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.currency_rupee),
                        contentDescription = "rupee",
                        tint = Color.Gray,
                        modifier = Modifier.size(20.dp).border(BorderStroke(.3.dp, color = Color.Gray), shape = CircleShape).padding(2.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "lifetime cashback ", color = Color.LightGray, fontSize = 14.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically) { Text( text = "₹3", color = Color.White, fontSize = 14.sp)
                    Icon(painter = painterResource(R.drawable.left_arrow_svgrepo_com), contentDescription = "forward", modifier = Modifier
                        .size(35.dp)
                        .padding(start = 5.dp).graphicsLayer { rotationY = 180f }, tint = Color.White)
                }
            }
            HorizontalDivider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))

            // category 3 -> bank balance check
            Row( horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Icon(
                        painter = painterResource(R.drawable.bhim),
                        contentDescription = "score",
                        tint = Color.Gray,
                        modifier = Modifier.size(20.dp).border(BorderStroke(.3.dp, color = Color.Gray), shape = CircleShape).padding(5.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(text = "bank balance", color = Color.LightGray, fontSize = 14.sp)
                }
                Row(verticalAlignment = Alignment.CenterVertically) { Text( text = "check", color = Color.White, fontSize = 14.sp)
                    Icon(painter = painterResource(R.drawable.left_arrow_svgrepo_com), contentDescription = "forward", modifier = Modifier
                        .size(35.dp)
                        .padding(start = 5.dp).graphicsLayer { rotationY = 180f }, tint = Color.White)
                }
            }



        }
        // second block
        Column(modifier = Modifier
            .weight(4.5f)
            .background(color = Color(0xFF1E1E1E))
            .fillMaxSize().padding(start = 24.dp, end = 15.dp, top = 16.dp)) {
            // Rewards and Benifits section
            Text(text = "YOUR REWARDS AND BENIFITS", color = Color.Gray, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, modifier = Modifier.padding(bottom = 30.dp))

            // Cashback Balance section
            Column() {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Column {  Text( text = "cashback balance", fontSize = 15.sp, color = Color.White)
                        Text( text = "₹0", fontSize = 15.sp, color = Color.Gray) }
                    Icon(painter = painterResource(R.drawable.arrow_right), contentDescription = "forward", modifier = Modifier.size(30.dp)
                        .padding(start = 5.dp), tint = Color.Gray)
                }
            }
            HorizontalDivider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
            // Coins section
            Column() {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Column {  Text( text = "coins", fontSize = 15.sp, color = Color.White)
                        Text( text = "26,46,583", fontSize = 15.sp, color = Color.Gray) }
                    Icon(painter = painterResource(R.drawable.arrow_right), contentDescription = "forward", modifier = Modifier.size(30.dp)
                        .padding(start = 5.dp), tint = Color.Gray)
                }
            }
            HorizontalDivider(color = Color.Gray, thickness = 1.dp, modifier = Modifier.padding(top = 10.dp, bottom = 10.dp))
            // Win section
            Column() {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Column {  Text( text = "win upto Rs 1000", fontSize = 15.sp, color = Color.White)
                        Text( text = "refer and earn", fontSize = 15.sp, color = Color.Gray) }
                    Icon(painter = painterResource(R.drawable.arrow_right), contentDescription = "forward", modifier = Modifier.size(30.dp)
                        .padding(start = 5.dp), tint = Color.Gray)
                }
            }

            Text(text = "TRANSACTIONS AND SUPPORT", color = Color.Gray, fontSize = 15.sp, fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 40.dp, bottom = 40.dp))
            Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                Text( text = "all transactions", fontSize = 15.sp, color = Color.White)
                Icon(painter = painterResource(R.drawable.arrow_right), contentDescription = "forward", modifier = Modifier.size(30.dp)
                    .padding(start = 5.dp), tint = Color.Gray)
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ProfilePreview() {
    ProfileActivityTheme {
        Interface(modifier = Modifier)
    }
}