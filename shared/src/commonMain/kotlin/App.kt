import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun App() {
    MaterialTheme {
        CommonFloatLayer()
    }
}

expect fun getPlatformName(): String