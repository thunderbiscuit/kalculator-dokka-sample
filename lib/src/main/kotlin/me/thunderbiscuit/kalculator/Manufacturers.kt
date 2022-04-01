package me.thunderbiscuit.kalculator

sealed class Manufacturers(val model: String) {
    object TexasInstruments : Manufacturers("TI-84")
    object Casio : Manufacturers("FX-300ESPLUS2")
}
