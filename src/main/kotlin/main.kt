import androidx.compose.desktop.Window
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

fun main() = Window {
    var text by remember { mutableStateOf(1) }

    MaterialTheme {
        Button(onClick = {
            text += 1
        }) {
            Text(text.toString())
        }
    }
}
