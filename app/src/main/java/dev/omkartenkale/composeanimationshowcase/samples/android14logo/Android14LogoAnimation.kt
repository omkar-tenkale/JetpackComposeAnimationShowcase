package dev.omkartenkale.composeanimationshowcase.samples.android14logo

import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay


@Composable
fun Android14LogoAnimation() {
    val logoAnimationProgress = remember {
        Animatable(0f)
    }
    var reverseAnimation by remember {
        mutableStateOf(false)
    }
    LaunchedEffect(Unit) {
        delay(2000)
        logoAnimationProgress.animateTo(
            1f, animationSpec = tween(2000, easing = FastOutSlowInEasing)
        )
        delay(6000)
        reverseAnimation = true
        logoAnimationProgress.animateTo(
            0f, animationSpec = tween(durationMillis = 1000, easing = FastOutSlowInEasing)
        )
    }
    Android14AnimatedLogo(logoAnimationProgress.value, reverseAnimation)
}

@Composable
private fun Android14AnimatedLogo(unitProgress: UnitProgress, reverseAnimation: Boolean) {
    Box(
        modifier = Modifier
            .width(256.dp)
            .height(256.dp)
            .scale(if (reverseAnimation) unitProgress else unitProgress.mapInRange(0f, 0.25f))
    ) {
        SpaceBackground()
        AndroidHead(unitProgress)
        Rocket(unitProgress)
        OrangeRibbon(unitProgress, reverseAnimation)
    }
}

@Preview(showBackground = false)
@Composable
fun Android14VectorAnimationPreview() {
    Android14AnimatedLogo(1f, false)
}