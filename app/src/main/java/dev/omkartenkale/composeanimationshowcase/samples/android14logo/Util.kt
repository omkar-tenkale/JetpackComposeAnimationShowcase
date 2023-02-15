package dev.omkartenkale.composeanimationshowcase.samples.android14logo


typealias UnitProgress = Float

fun UnitProgress.mapInRange(start: UnitProgress, end: UnitProgress): UnitProgress {
    if (this < start) {
        return 0f
    }
    if (this > end) {
        return 1f
    }
    val value = this
    val outMin = 0f
    val outMax = 1f
    return outMin + (((value - start) / (end - start)) * (outMax - outMin))
}
