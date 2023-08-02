package com.samra.kotlinoop

class User:People {
    //Property
    var name : String? =null
    var age : Int? = null

    //Consturtor bir sinifden obyeckt ya da instans yaradilan zaman cagirilan ilk funksiyadi
    //Constructor vs Init
    constructor(name:String , age:Int){
        this.name = name
        this.age = age
    }
}
