package dev.omkartenkale.composeanimationshowcase.samples.android14logo

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.unit.dp


@Composable
fun randomStarOpacity(): Float {
    val infiniteTransition = rememberInfiniteTransition()
    val fadeAmount by infiniteTransition.animateFloat(
        initialValue = 0f, targetValue = 1f, animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 2000, easing = FastOutSlowInEasing
            ), repeatMode = RepeatMode.Reverse, initialStartOffset = StartOffset((0..4000).random())
        )
    )
    return fadeAmount
}

@Composable
fun SpaceBackground() {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(Color(0xFF073042))
    }

    val star1Opacity = randomStarOpacity()
    val star2Opacity = randomStarOpacity()
    val star3Opacity = randomStarOpacity()
    val star4Opacity = randomStarOpacity()
    val star5Opacity = randomStarOpacity()
    val star6Opacity = randomStarOpacity()
    val star7Opacity = randomStarOpacity()
    val star8Opacity = randomStarOpacity()
    val star9Opacity = randomStarOpacity()
    val star10Opacity = randomStarOpacity()
    val star11Opacity = randomStarOpacity()
    val star12Opacity = randomStarOpacity()
    val star13Opacity = randomStarOpacity()
    val star14Opacity = randomStarOpacity()

    Canvas(modifier = Modifier.fillMaxSize()) {
        drawStar(63, 176, 4.5f, star1Opacity)
        drawStar(76, 138, 4.5f, star2Opacity)
        drawStar(82, 116, 3f, star3Opacity)
        drawStar(91, 149, 3f, star4Opacity)
        drawStar(91, 162, 3f, star5Opacity)
        drawStar(109, 129, 4.5f, star6Opacity)
        drawStar(137, 173, 5f, star7Opacity)
        drawStar(149, 189, 5f, star8Opacity)
        drawStar(144, 136, 3f, star9Opacity)
        drawStar(149, 156, 3f, star10Opacity)
        drawStar(169, 148, 5f, star11Opacity)
        drawStar(163, 118, 2f, star12Opacity)
        drawStar(190, 183, 3f, star13Opacity)
        drawStar(196, 103, 4.5f, star14Opacity)
    }
}

fun DrawScope.drawStar(xOffset: Int, yOffset: Int, sizeDp: Float, alpha: Float) {
    drawRect(
        Color.White,
        topLeft = Offset(xOffset.dp.toPx(), yOffset.dp.toPx()),
        size = Size(sizeDp.dp.toPx(), sizeDp.dp.toPx()),
        alpha = alpha
    )
}
