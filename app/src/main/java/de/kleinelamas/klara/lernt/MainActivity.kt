package de.kleinelamas.klara.lernt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.kleinelamas.klara.lernt.code.Bedingungen
import de.kleinelamas.klara.lernt.ui.theme.KlaraLerntTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KlaraLerntTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Column(
                        modifier = Modifier.padding(
                            horizontal = 16.dp,
                            vertical = 8.dp,
                        )
                    ) {
                        Column {
                            Row {
                                Text(
                                    "Braunbär",
                                    Modifier.padding(end = 4.dp)
                                )
                                Text(Bedingungen.ifFuerAnfaenger("Braunbär"))
                            }
                            Row {
                                Text(
                                    "Pandabär",
                                    Modifier.padding(end = 4.dp)
                                )
                                Text(Bedingungen.ifFuerAnfaenger("Pandabär"))
                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hallo $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    KlaraLerntTheme {
        Column(
            modifier = Modifier.padding(
                horizontal = 16.dp,
                vertical = 8.dp,
            )
        ) {
            Greeting("Panda")
        }
    }
}