package dev.omkartenkale.composeanimationshowcase.samples.android14logo

import android.graphics.RectF
import android.graphics.Typeface
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import android.graphics.Paint as AndroidPaint
import android.graphics.Path as AndroidPath
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun OrangeRibbon(unitProgress: UnitProgress, reverseAnimation: Boolean) {
    Canvas(modifier = Modifier.fillMaxSize()) {
        drawCircle(
            color = Color(0xFFf86734),
            radius = size.width / 2 - (16.dp.toPx() * unitProgress.mapInRange(0f, 0.25f)),
            style = Stroke(width = 32.dp.toPx() * unitProgress.mapInRange(0f, 0.25f))
        )
    }

    val vector = ImageVector.Builder(
        defaultWidth = 256.dp, defaultHeight = 256.dp, viewportWidth = 512f, viewportHeight = 512f
    ).apply {
        //Text 'ANDROID 14'
        group {
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(93.33f, 116.36f)
                lineToRelative(3.84f, -4.36f)
                lineToRelative(29.63f, 9.75f)
                lineToRelative(-4.43f, 5.03f)
                lineToRelative(-6.22f, -2.09f)
                lineToRelative(-7.85f, 8.90f)
                lineToRelative(2.86f, 5.91f)
                lineToRelative(-4.43f, 5.03f)
                lineToRelative(-13.39f, -28.18f)
                close()
                moveTo(110.42f, 122.75f)
                lineToRelative(-8.86f, -3.02f)
                lineToRelative(4.10f, 8.41f)
                lineToRelative(4.75f, -5.39f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(153.62f, 100.85f)
                lineToRelative(-21.71f, -6.20f)
                lineToRelative(10.37f, 14.38f)
                lineToRelative(-5.20f, 3.75f)
                lineToRelative(-16.78f, -23.26f)
                lineToRelative(4.48f, -3.23f)
                lineToRelative(21.65f, 6.19f)
                lineToRelative(-10.35f, -14.34f)
                lineToRelative(5.24f, -3.78f)
                lineToRelative(16.78f, 23.26f)
                lineToRelative(-4.48f, 3.23f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(161.46f, 63.14f)
                lineToRelative(8.99f, -3.84f)
                curveToRelative(7.43f, -3.17f, 15.96f, 0.12f, 19.09f, 7.43f)
                curveToRelative(3.12f, 7.31f, -0.38f, 15.76f, -7.81f, 18.94f)
                lineToRelative(-8.99f, 3.84f)
                lineToRelative(-11.27f, -26.38f)
                close()
                moveTo(179.41f, 80.25f)
                curveToRelative(4.45f, -1.90f, 5.95f, -6.72f, 4.14f, -10.95f)
                curveToRelative(-1.81f, -4.23f, -6.32f, -6.47f, -10.78f, -4.57f)
                lineToRelative(-3.08f, 1.31f)
                lineToRelative(6.64f, 15.53f)
                lineToRelative(3.08f, -1.31f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(204.22f, 47.57f)
                lineToRelative(11.09f, -2.19f)
                curveToRelative(5.31f, -1.05f, 9.47f, 2.07f, 10.39f, 6.75f)
                curveToRelative(0.72f, 3.64f, -0.75f, 6.36f, -4.07f, 8.34f)
                lineToRelative(12.40f, 10.43f)
                lineToRelative(-7.56f, 1.49f)
                lineToRelative(-11.65f, -9.76f)
                lineToRelative(-1.03f, 0.20f)
                lineToRelative(2.29f, 11.61f)
                lineToRelative(-6.30f, 1.24f)
                lineToRelative(-5.56f, -28.13f)
                close()
                moveTo(216.78f, 56.7f)
                curveToRelative(1.86f, -0.36f, 2.99f, -1.70f, 2.67f, -3.33f)
                curveToRelative(-0.33f, -1.70f, -1.88f, -2.42f, -3.74f, -2.06f)
                lineToRelative(-4.04f, 0.80f)
                lineToRelative(1.06f, 5.38f)
                lineToRelative(4.04f, -0.8f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(244.29f, 55.6f)
                curveToRelative(0.13f, -8.15f, 6.86f, -14.71f, 15.06f, -14.58f)
                curveToRelative(8.15f, 0.13f, 14.71f, 6.90f, 14.58f, 15.06f)
                reflectiveCurveToRelative(-6.90f, 14.71f, -15.06f, 14.58f)
                curveToRelative(-8.19f, -0.13f, -14.71f, -6.90f, -14.58f, -15.06f)
                close()
                moveTo(267.43f, 55.97f)
                curveToRelative(0.07f, -4.64f, -3.53f, -8.66f, -8.18f, -8.73f)
                curveToRelative(-4.68f, -0.07f, -8.42f, 3.82f, -8.5f, 8.46f)
                curveToRelative(-0.07f, 4.64f, 3.53f, 8.66f, 8.22f, 8.73f)
                curveToRelative(4.64f, 0.07f, 8.38f, -3.82f, 8.46f, -8.46f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(294.38f, 44.83f)
                lineToRelative(6.30f, 1.23f)
                lineToRelative(-5.49f, 28.15f)
                lineToRelative(-6.30f, -1.23f)
                lineToRelative(5.49f, -28.15f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(321.93f, 51.41f)
                lineToRelative(9.13f, 3.48f)
                curveToRelative(7.55f, 2.87f, 11.39f, 11.17f, 8.55f, 18.61f)
                curveToRelative(-2.83f, 7.43f, -11.22f, 11.07f, -18.77f, 8.19f)
                lineToRelative(-9.13f, -3.48f)
                lineToRelative(10.21f, -26.80f)
                close()
                moveTo(322.95f, 76.18f)
                curveToRelative(4.53f, 1.72f, 8.95f, -0.69f, 10.59f, -4.99f)
                curveToRelative(1.64f, -4.30f, -0.05f, -9.05f, -4.58f, -10.78f)
                lineToRelative(-3.13f, -1.19f)
                lineToRelative(-6.01f, 15.77f)
                lineToRelative(3.13f, 1.19f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(381.40f, 89.23f)
                lineToRelative(-4.20f, -3.21f)
                lineToRelative(3.65f, -4.78f)
                lineToRelative(9.05f, 6.91f)
                lineToRelative(-17.39f, 22.80f)
                lineToRelative(-4.85f, -3.7f)
                lineToRelative(13.74f, -18.01f)
                close()
            }
            path(
                fill = SolidColor(Color.White),
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveToRelative(397.95f, 126.37f)
                lineToRelative(-9.55f, -10.25f)
                lineToRelative(3.60f, -3.36f)
                lineToRelative(22.79f, -1.25f)
                lineToRelative(3.74f, 4.02f)
                lineToRelative(-12.35f, 11.51f)
                lineToRelative(2.50f, 2.68f)
                lineToRelative(-4.07f, 3.80f)
                lineToRelative(-2.50f, -2.68f)
                lineToRelative(-4.55f, 4.24f)
                lineToRelative(-4.15f, -4.46f)
                lineToRelative(4.55f, -4.24f)
                close()
                moveTo(407.82f, 117.17f)
                lineToRelative(-10.28f, 0.58f)
                lineToRelative(4.48f, 4.81f)
                lineToRelative(5.79f, -5.39f)
                close()
            }
        }
    }.build()
    val painter = rememberVectorPainter(image = vector)
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .scale(1.11f)
            .alpha(unitProgress.mapInRange(0f, 0.25f))
            .rotate(
                (if (reverseAnimation) {
                    45 - 45 * unitProgress
                } else {
                    -45 + 45 * unitProgress.mapInRange(0.25f, 1f)
                })
            )
    ) {
        with(painter) {
            draw(intrinsicSize)
        }
    }
}

//Legacy method
private fun DrawScope.drawAndroid14Text(canvasSize: Dp) {
    drawIntoCanvas {
        it.nativeCanvas.apply {
            drawTextOnPath(
                /* text = */ "ANDROID 14",
                /* path = */ AndroidPath().apply {
                    addArc(
                        RectF(
                            18.dp.toPx(),
                            18.dp.toPx(),
                            canvasSize.toPx() - 18.dp.toPx(),
                            canvasSize.toPx() - 18.dp.toPx()
                        ), 180f, 180f
                    )
                },
                /* hOffset = */ 0f,
                /* vOffset = */ 2.dp.toPx(),
                /* paint = */ AndroidPaint().apply {
                    letterSpacing = 0.25f
                    textSize = 24.dp.toPx()
                    textAlign = AndroidPaint.Align.CENTER
                    color = android.graphics.Color.WHITE
                    typeface = Typeface.DEFAULT_BOLD
                }
            )
        }
    }
}