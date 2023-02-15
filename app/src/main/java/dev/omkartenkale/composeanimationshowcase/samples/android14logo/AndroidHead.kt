package dev.omkartenkale.composeanimationshowcase.samples.android14logo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp


@Composable
fun AndroidHead(unitProgress: UnitProgress) {
    Canvas(
        modifier = Modifier
            .fillMaxSize()
            .clip(CircleShape)
    ) {
        drawArc(
            color = Color.White,
            startAngle = 0f,
            sweepAngle = 180f,
            useCenter = false,
            topLeft = Offset(
                28.dp.toPx(),
                (-110).dp.toPx() + 12.dp.toPx() - (110.dp.toPx() - (110.dp.toPx()) * unitProgress.mapInRange(
                    0f, 0.5f
                ))
            ),
            size = Size(200.dp.toPx(), 200.dp.toPx())
        )
        val translatePx = 110.dp.toPx() - 110.dp.toPx() * unitProgress.mapInRange(0f, 0.5f)
        drawLine(
            color = Color.White,
            start = Offset(x = 80f.dp.toPx() + translatePx / 2, y = 90f.dp.toPx() - translatePx),
            end = Offset(x = 62f.dp.toPx() + translatePx / 2, y = 122.dp.toPx() - translatePx),
            strokeWidth = 7.dp.toPx(),
            cap = StrokeCap.Round
        )
        drawLine(
            color = Color.White,
            start = Offset(x = 174f.dp.toPx() - translatePx / 2, y = 90f.dp.toPx() - translatePx),
            end = Offset(x = 192f.dp.toPx() - translatePx / 2, y = 122.dp.toPx() - translatePx),
            strokeWidth = 7.dp.toPx(),
            cap = StrokeCap.Round
        )
    }
}