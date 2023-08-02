package com.samra.kotlinoop

class Dog:Animal() {
    fun test (){
        super.sing()
    }
    override fun sing(){
        println("Dog sing")
    }
}