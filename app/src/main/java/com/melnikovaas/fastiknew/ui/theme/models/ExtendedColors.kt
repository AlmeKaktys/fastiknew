package com.melnikovaas.fastiknew.ui.theme.models

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Дополнительные цвета, которых нет в стандартной Material-схеме
 * (свечение кнопки, цвет заголовков и т.д.).
 *
 * Стандартная схема Material (colorScheme) знает только свои роли:
 * primary, background, surface и т.п. Всё специфичное для FastikVPN
 * складываем сюда, и оно так же переключается вместе с темой.
 */
data class ExtendedColors(
    // Круг кнопки подключения: градиент от start к end
    val connect_gradient_start: Color,
    val connect_gradient_end: Color,
    // Внешние круги свечения вокруг кнопки
    val connect_ring_second: Color,
    val connect_ring_third: Color,
    // Цвет заголовков и названия приложения
    val title: Color,
    // Акцентная кнопка («Войти») и текст на ней
    val accent_button: Color,
    val on_accent_button: Color,
    // Неактивная кнопка (пользователь не авторизован)
    val disabled_container: Color,
    val disabled_content: Color,
    // Иконки нижнего меню
    val nav_icon_active: Color,
    val nav_icon_inactive: Color,
    // Цвет ошибок
    val error: Color
)

/** Набор для тёмной темы. */
val DarkExtendedColors = ExtendedColors(
    connect_gradient_start = circle_gradient_start,
    connect_gradient_end = circle_gradient_end,
    connect_ring_second = circle_second,
    connect_ring_third = circle_third,
    title = title_purple,
    accent_button = bg_button,
    on_accent_button = text_white,
    disabled_container = disabled_dark,
    disabled_content = inactive_icon_dark,
    nav_icon_active = circle_gradient_start,
    nav_icon_inactive = inactive_icon_dark,
    error = error_red
)

/** Набор для светлой темы. */
val LightExtendedColors = ExtendedColors(
    connect_gradient_start = circle_gradient_start,
    connect_gradient_end = circle_gradient_end,
    connect_ring_second = circle_second,
    connect_ring_third = circle_third,
    title = title_purple,
    accent_button = bg_button,
    on_accent_button = text_white,
    disabled_container = disabled_light,
    disabled_content = inactive_icon_light,
    nav_icon_active = bg_button,
    nav_icon_inactive = inactive_icon_light,
    error = error_red
)

/**
 * CompositionLocal: механизм Compose, который «спускает» значение вниз по дереву
 * UI без передачи параметрами. Тема кладёт сюда нужный набор цветов, а любой
 * экран читает его через FastikTheme.colors.
 * Значение по умолчанию - тёмный набор (на случай, если тему забыли подключить).
 */
val LocalExtendedColors = staticCompositionLocalOf { DarkExtendedColors }