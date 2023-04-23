package team.islands.skzmk.ui.views

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountCircle
import androidx.compose.material.icons.outlined.Build
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun BottomMenu() {

    var selectedItem by remember { mutableStateOf(0) }

    val sections = listOf(
        "Заказы", "В процессе", "Чаты", "Профиль"
    )

    val icons = listOf(
        Icons.Outlined.List,
        Icons.Outlined.Build,
        Icons.Outlined.Email,
        Icons.Outlined.AccountCircle
    )

    NavigationBar {
        sections.forEachIndexed { index, item ->
            NavigationBarItem(
                icon = { Icon(icons[index], contentDescription = item) },
                label = { Text(text = sections[index]) },
                selected = selectedItem == index,
                onClick = { selectedItem = index },
                alwaysShowLabel = false
            )
        }
    }
}