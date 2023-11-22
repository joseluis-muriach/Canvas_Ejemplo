package com.example.canvas_ejemplo

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PointMode
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun canvas() {
    Canvas(modifier = Modifier.fillMaxSize()) {

        val mySize = 50f
        val myMargin = 50f

        // Rectángulo en la esquina superior izquierda (LA VERDE)
        drawRect(
            color = Color.Green,
            topLeft = Offset(x = myMargin, y = myMargin),
            size = Size(width = mySize, height = mySize)
        )

        // Rectángulo en la esquina superior derecha (LA GRIS)
        drawRect(
            color = Color.Gray,
            topLeft = Offset(x = size.width - myMargin - mySize, y = myMargin),
            size = Size(width = mySize, height = mySize)
        )

        // Rectángulo en la esquina inferior izquierda (LA AMARILLA)
        drawRect(
            color = Color.Yellow,
            topLeft = Offset(x = myMargin, y = size.width - myMargin - mySize),
            size = Size(width = mySize, height = mySize)
        )

        // Rectángulo en la esquina inferior derecha (LA ROJA)
        drawRect(
            color = Color.Red,
            topLeft = Offset(
                x = size.width - myMargin - mySize,
                y = size.width - myMargin - mySize
            ),
            size = Size(width = mySize, height = mySize)
        )

        // Círculo en el centro sin relleno
        drawCircle(
            color = Color.Blue,
            center = Offset(x = size.width / 2, y = size.width / 2),
            radius = 150.dp.toPx(),
            style = Stroke(width = 2.dp.toPx()) //sin relleno
        )

        // Punto en el centro del canvas (EL LILA)
        drawPoints(
            points = listOf(Offset(size.width / 2, size.width / 2)),
            pointMode = PointMode.Points,
            color = Color.Magenta,
            strokeWidth = mySize / 2
        )
    }
}