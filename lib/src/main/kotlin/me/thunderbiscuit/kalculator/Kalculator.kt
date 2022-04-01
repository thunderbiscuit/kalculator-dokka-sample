package me.thunderbiscuit.kalculator

class Kalculator {
    val surprise: Double
        get() = Math.random()

    fun greetings(name: String) {
        println("Greetings $name! I'm your Kotlin calculator.")
    }

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}
