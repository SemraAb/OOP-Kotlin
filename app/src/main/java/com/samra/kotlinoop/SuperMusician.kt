package com.samra.kotlinoop

class SuperMusician(name: String, age: Int, instrument: String  , lut:Int) : Musician(name, age, instrument ) {
    var lut :Int? = lut
    fun sing(){
        println("Just the two of us")
    }
}