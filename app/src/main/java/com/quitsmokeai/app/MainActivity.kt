package com.quitsmokeai.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            QuitSmokeAI()
        }
    }
}

@Composable
fun QuitSmokeAI() {

    var days by remember { mutableStateOf(0) }
    var cigarettes by remember { mutableStateOf(0) }
    var money by remember { mutableStateOf(0) }

    MaterialTheme {

        Surface(
            modifier = Modifier.fillMaxSize()
        ) {

            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Text(
                    text = "QuitSmokeAI 🚭",
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Твой путь к жизни без сигарет",
                    fontSize = 17.sp
                )

                Spacer(modifier = Modifier.height(35.dp))

                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Column(
                        modifier = Modifier.padding(24.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            text = "Дней без сигарет",
                            fontSize = 18.sp
                        )

                        Text(
                            text = "$days",
                            fontSize = 48.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

                Spacer(modifier = Modifier.height(20.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(end = 6.dp)
                    ) {

                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Text("🚬")
                            Text(
                                text = "$cigarettes",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text("Не выкурено")
                        }
                    }

                    Card(
                        modifier = Modifier
                            .weight(1f)
                            .padding(start = 6.dp)
                    ) {

                        Column(
                            modifier = Modifier.padding(16.dp),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Text("💰")
                            Text(
                                text = "$money ₸",
                                fontSize = 25.sp,
                                fontWeight = FontWeight.Bold
                            )
                            Text("Сэкономлено")
                        }
                    }
                }

                Spacer(modifier = Modifier.height(30.dp))

                Button(
                    onClick = {
                        days++
                        cigarettes += 20
                        money += 2000
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {

                    Text(
                        text = "Я не курил сегодня 🚭",
                        fontSize = 18.sp
                    )
                }

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "Ты уже сделал важный шаг. Продолжай! 💪",
                    fontSize = 16.sp
                )
            }
        }
    }
}
