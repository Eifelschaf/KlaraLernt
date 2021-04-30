package de.kleinelamas.klara.lernt.helfer.modelle

data class Tier(
    var name: String,
    val art: String,
    val farbe: String,
    var gewicht: Int,
    val nahrung: String,
) {
    fun essen(menge: Int) {
        this.gewicht += menge
    }
}