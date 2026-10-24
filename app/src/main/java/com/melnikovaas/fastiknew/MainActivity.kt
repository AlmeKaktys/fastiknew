package com.melnikovaas.fastiknew

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import com.melnikovaas.fastiknew.ui.theme.constans.Dimens
import com.melnikovaas.fastiknew.ui.theme.models.ThemeMode
import com.melnikovaas.fastiknew.ui.theme.models.FastikTheme
import com.melnikovaas.fastiknew.ui.theme.models.FastikVpnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            // Запоминаем текущую тему (по умолчанию системная)
            var currentTheme by remember { mutableStateOf(ThemeMode.SYSTEM) }

            // Передаем текущую тему в FastikVpnTheme
            FastikVpnTheme(themeMode = currentTheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThemeCheck(
                        // При нажатии на кнопку обновляем переменную currentTheme
                        onThemeSelected = { newTheme -> currentTheme = newTheme }
                    )
                }
            }
        }
    }
}

@Composable
private fun ThemeCheck(onThemeSelected: (ThemeMode) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(Dimens.screen_padding),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "FastikNew",
            style = MaterialTheme.typography.headlineMedium,
            color = FastikTheme.colors.title
        )

        Box(
            modifier = Modifier
                .padding(Dimens.spacing_xl)
                .size(Dimens.first_circle)
                .clip(CircleShape)
                .background(
                    Brush.linearGradient(
                        listOf(
                            FastikTheme.colors.connect_gradient_start,
                            FastikTheme.colors.connect_gradient_end
                        )
                    )
                )
        )

        Text(
            text = "Выберите тему",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onBackground
        )

        Row(
            modifier = Modifier.padding(top = Dimens.spacing_m),
            horizontalArrangement = Arrangement.spacedBy(Dimens.spacing_s)
        ) {
            Button(onClick = { onThemeSelected(ThemeMode.DARK) }) {
                Text("Темная")
            }
            Button(onClick = { onThemeSelected(ThemeMode.LIGHT) }) {
                Text("Светлая")
            }
            Button(onClick = { onThemeSelected(ThemeMode.SYSTEM) }) {
                Text("Системная")
            }
        }
    }
}