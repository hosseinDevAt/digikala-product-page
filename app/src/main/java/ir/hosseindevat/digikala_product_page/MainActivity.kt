package ir.hosseindevat.digikala_product_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        enableEdgeToEdge()
        setContent {
            SetUI()
        }
    }

    @Preview(
        name = "hossein",
        showBackground = true,
        showSystemUi = true,
        device = Devices.NEXUS_5X
    )

    @Composable
    fun SetUI() {



    }


}

