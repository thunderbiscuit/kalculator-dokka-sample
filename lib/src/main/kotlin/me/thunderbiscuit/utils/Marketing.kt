package me.thunderbiscuit.utils

import me.thunderbiscuit.kalculator.Manufacturers

public fun printAvailableModels(): Unit {
    println("Currently offered models:")
    println(Manufacturers.TexasInstruments.model)
    println(Manufacturers.Casio.model)
}
