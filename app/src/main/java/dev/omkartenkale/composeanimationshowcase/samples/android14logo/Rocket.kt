package dev.omkartenkale.composeanimationshowcase.samples.android14logo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.shape.GenericShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp


@Composable
fun Rocket(unitProgress: UnitProgress) {
    fun Path.rocketPath(size: Size, unitProgress: UnitProgress, dpToPx20: Float) {
        val part1UnitProgress = (unitProgress * 2).coerceIn(0f, 1f)
        val part2UnitProgress = (unitProgress - 0.3f).coerceIn(0f, 1f) * 2
        moveTo(0f, 0f)
        lineTo(0f, (size.height) * part1UnitProgress)
        relativeLineTo(size.width / 2 - dpToPx20, 0f)
        lineTo(size.width / 2 - dpToPx20, 0f)
        addPath(Path().apply {
            moveTo(0f, size.height)
            lineTo(size.width, size.height)
            relativeLineTo(0f, -size.height * part2UnitProgress)
            relativeLineTo(-size.width, 0f)
            close()
        })
        close()
    }

    val vector = ImageVector.Builder(
        defaultWidth = 256.dp, defaultHeight = 256.dp, viewportWidth = 512f, viewportHeight = 512f
    ).apply {
        group {
            //Rocket Head
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(256.22f, 126.56f)
                curveToRelative(-6.69f, 0.0f, -12.12f, 5.27f, -12.12f, 11.77f)
                verticalLineToRelative(14.519f)
                curveToRelative(0.0f, 1.25f, 1.01f, 2.27f, 2.27f, 2.27f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.25f, 0.0f, 2.27f, -1.01f, 2.27f, -2.27f)
                verticalLineToRelative(-3.914f)
                curveToRelative(0.0f, -2.51f, 2.03f, -4.54f, 4.54f, -4.54f)
                horizontalLineToRelative(6.06f)
                curveToRelative(2.51f, 0.0f, 4.54f, 2.03f, 4.54f, 4.54f)
                verticalLineToRelative(3.914f)
                curveToRelative(0.0f, 1.25f, 1.01f, 2.27f, 2.27f, 2.27f)
                reflectiveCurveToRelative(2.27f, -1.01f, 2.27f, -2.27f)
                verticalLineToRelative(-14.51f)
                curveToRelative(0.0f, -6.50f, -5.42f, -11.77f, -12.12f, -11.77f)
                close()
            }
            //Rocket path 1
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(250.11f, 170.28f)
                lineTo(262.32f, 170.28f)
                arcTo(1.97f, 1.97f, 0.0f, false, true, 264.3f, 172.26f)
                lineTo(264.3f, 176.39f)
                arcTo(1.97f, 1.97f, 0.0f, false, true, 262.32f, 178.36f)
                lineTo(250.11f, 178.36f)
                arcTo(1.97f, 1.97f, 0.0f, false, true, 248.14f, 176.39f)
                lineTo(248.14f, 172.26f)
                arcTo(1.97f, 1.97f, 0.0f, false, true, 250.11f, 170.28f)
                close()
            }
            //Rocket path 2
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(250.26f, 187.65f)
                lineTo(262.17f, 187.65f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 264.3f, 189.78f)
                lineTo(264.3f, 217.85f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 262.17f, 219.97f)
                lineTo(250.26f, 219.97f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 248.14f, 217.85f)
                lineTo(248.14f, 189.78f)
                arcTo(2.12f, 2.12f, 0.0f, false, true, 250.26f, 187.65f)
                close()
            }
            //Rocket tail
            path(
                fill = SolidColor(Color(0xFF3ddc84)),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(195.27f, 187.64f)
                lineToRelative(2.25f, -6.68f)
                curveToRelative(13.91f, 78.12f, 50.84f, 284.38f, 50.84f, 50.33f)
                curveToRelative(0.0f, -0.97f, 0.72f, -1.81f, 1.61f, -1.81f)
                horizontalLineToRelative(12.69f)
                curveToRelative(0.89f, 0.0f, 1.62f, 0.82f, 1.62f, 1.80f)
                curveToRelative(-0.20f, 409.90f, -69.03f, -43.63f, -69.03f, -43.63f)
                close()
            }
        }
    }.build()
    val painter = rememberVectorPainter(image = vector)
    val dpToPx20 = with(LocalDensity.current) { 8.dp.toPx() }
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .offset(y = 6.dp)
            .clip(GenericShape { size: Size, _: LayoutDirection ->
                rocketPath(size, unitProgress.mapInRange(0.2f, 1f), dpToPx20)
            })
    ) {
        with(painter) {
            draw(intrinsicSize)
        }
    }
}