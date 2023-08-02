package com.samra.kotlinoop

open class Musician(name: String, age: Int, instrument: String) {
    // primary constructor

    var name :String? = name
        private set
        get
    var age :Int? = age
        private set
        get
    private var instrument :String? = instrument

    private val bandName = "Metellica"

   fun returnBandName (password:String):String{
        if(password=="Semra"){
            return this.bandName
        }else{
            return "Wrong Password!"
        }
    }


    /*Bezen isteyirik ki classdaki bezi propertileri sonradan deyismeyek
 bunun ucun onlari capsule ede bilerik , yeni capsuluya alirsan qoymursan deyissin, heps edirsen
 bu encapsulasiyadir
 */
}