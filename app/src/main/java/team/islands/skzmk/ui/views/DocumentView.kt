package team.islands.skzmk.ui.views

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Document() {
    Column {
        Card(
            modifier = Modifier
                .padding(22.dp)
                .fillMaxWidth()
                .wrapContentHeight()
        ) {
            var expanded by remember { mutableStateOf(false) }

            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(22.dp)
                    .clickable { expanded = !expanded }
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Icon(
                        imageVector = Icons.Outlined.Info,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 14.dp)
                            .align(Alignment.CenterVertically)
                            .size(28.dp)
                    )

                    Text(
                        text = "ДОКУМЕНТ",
                        fontWeight = FontWeight.Black,
                        fontSize = 22.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }

                AnimatedVisibility(visible = expanded) {
                    Text(
                        modifier = Modifier.padding(top = 16.dp),
                        text = "Тут следует большое описание подрядчика",
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp
                    )
                }
            }
        }
    }
}