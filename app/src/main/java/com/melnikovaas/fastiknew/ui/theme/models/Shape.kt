package com.melnikovaas.fastiknew.ui.theme.models

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import com.melnikovaas.fastiknew.ui.theme.constans.Dimens

/**
 * Скругления компонентов. Значения берутся из Dimens (радиусы с дашборда):
 *  small  - карточка IP;
 *  medium - кнопки;
 *  large  - нижнее меню.
 */
val AppShapes = Shapes(
    small = RoundedCornerShape(Dimens.ip_card_radius),
    medium = RoundedCornerShape(Dimens.enter_button_radius),
    large = RoundedCornerShape(Dimens.bottom_bar_radius)
)