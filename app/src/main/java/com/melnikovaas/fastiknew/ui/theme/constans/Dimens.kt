package com.melnikovaas.fastiknew.ui.theme.constans

import androidx.compose.ui.unit.dp

object Dimens {

    private const val design_width_px = 1440f
    private const val target_width_dp = 390f
    private const val figma_scale = target_width_dp / design_width_px

    /** Переводит размер из макета в dp. */
    private fun from_design(px: Int) = (px * figma_scale).dp

    // --- Круги кнопки подключения ---
    val first_circle = from_design(742)
    val second_circle = from_design(928)
    val third_circle = from_design(1100)

    // --- Иконка Wi-Fi внутри кнопки ---
    val wifi_icon_width = from_design(437)
    val wifi_icon_height = from_design(350)

    // --- Нижнее меню ---
    val bottom_bar_width = from_design(1240)
    val bottom_bar_height = from_design(242)
    val bottom_bar_radius = from_design(26)
    val nav_icon_size = from_design(100)

    // --- Кнопка «Войти» ---
    val enter_button_width = from_design(835)
    val enter_button_height = from_design(130)
    val enter_button_radius = from_design(40)

    // --- Карточка IP ---
    val ip_card_width = from_design(676)
    val ip_card_height = from_design(243)
    val ip_card_radius = from_design(26)
    val ip_icon_width = from_design(178)
    val ip_icon_height = from_design(113)

    // --- Общие отступы (стандартная сетка кратна 4 dp) ---
    val spacing_xs = 4.dp
    val spacing_s = 8.dp
    val spacing_m = 16.dp
    val spacing_l = 24.dp
    val spacing_xl = 32.dp
    val screen_padding = 20.dp
}