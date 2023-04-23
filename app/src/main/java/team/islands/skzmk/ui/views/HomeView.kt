package team.islands.skzmk.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Home() {
    Column(
        verticalArrangement = Arrangement.Bottom
    ) {
        BottomMenu()
    }
}
