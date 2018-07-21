package com.example

class App {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println("Hello World (kotlin)")

            val appKotlin = App()
            println("that's a kotlin class: $appKotlin")
            val appJava = AppJava()
            println("that's a java class: $appJava")
        }
    }
}