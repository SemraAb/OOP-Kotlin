package com.samra.kotlinoop

class Piano:HouseDecoration , Instrument {
    var brandName :String? = null
    var digital :Boolean? = null

    override var roomName: String
        get() = "kitchen"
        set(value) {}

    override fun info() {
        println("instrument info")
    }

}