package de.kleinelamas.klara.lernt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.kleinelamas.klara.lernt.code.Bedingungen
import de.kleinelamas.klara.lernt.ui.theme.Green200
import de.kleinelamas.klara.lernt.ui.theme.KlaraLerntTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KlaraLerntTheme {
                Scaffold(
                    topBar = {
                        TopAppBar(
                            backgroundColor = MaterialTheme.colors.primaryVariant,
                            title = {
                            Text("Bärenauslese")
                        })
                    },
                    // A surface container using the 'background' color from the theme
                    content = {
                        PandaContent()
                    },
                )
            }
        }
    }
}

@Composable
fun PandaContent() {
    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier
                .padding(
                    horizontal = 16.dp,
                )
                .verticalScroll(rememberScrollState())
                .padding(vertical = 8.dp)
        ) {
            Column {
                listOf(
                    "roter Panda",
                    "Braunbär",
                    "großer Panda",
                    "Eisbär",
                    "Nasenbär",
                    "Gummibär"
                ).map {
                    Card(
                        Modifier
                            .padding(4.dp)
                            .fillMaxWidth()) {
                        Row(Modifier.padding(16.dp)) {
                            Text(
                                it,
                                Modifier.padding(end = 4.dp)
                            )
                            Text(Bedingungen.istEinPanda(it))
                        }
                    }
                }
                listOf(
                    "Erdbeere",
                    "Blaubär",
                    "Blaubeere",
                    "Eisbär",
                    "Teddybär",
                    "Gummibär",
                    "Fisch",
                ).map {
                    Card(
                        Modifier
                            .padding(4.dp)
                            .fillMaxWidth(), backgroundColor = if (Bedingungen.istEinBaer(it)) MaterialTheme.colors.primaryVariant else MaterialTheme.colors.error) {
                        Row(Modifier.padding(16.dp)) {
                            Text(
                                it,
                                Modifier.padding(end = 4.dp)
                            )
                            Text(if (Bedingungen.istEinBaer(it)) "Füttern!" else "Futtern")
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KlaraLerntTheme {
        PandaContent()
    }
}