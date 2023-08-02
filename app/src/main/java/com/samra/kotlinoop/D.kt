package com.samra.kotlinoop

class D: A , B {


    override fun foo() {
        println("Ikisinide eledi")
        super<A>.foo()

    }

    override fun bar() {
        super<B>.bar()
    }



}
fun main(){

}
