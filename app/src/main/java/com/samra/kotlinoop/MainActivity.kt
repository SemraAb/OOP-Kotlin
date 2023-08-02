package com.samra.kotlinoop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myUser = User("Samra" , 12)


        myUser.name = "Ceyhun"
        println(myUser.age)
        println(myUser.name)
        println(myUser.information()) // abstract

        //encapsulation

        var myMusician = Musician("Sting" , 55 , "band")
        // myMusician.age= 33 setter private dir deye deyise bilmirem
        println(myMusician.age) //  amma oxuya bilirem cunki get private DEYIL
        println(myMusician.returnBandName("Semra"))
        println(myMusician.returnBandName("khsdfkahdf"))


        // inheritance
        var mySuperMusician = SuperMusician("Beyence" , 45 , "vocal" , 2)
        println(mySuperMusician.name)
        println(mySuperMusician.lut)
        println(mySuperMusician.returnBandName("Semra"))
        mySuperMusician.sing()



        //polymorphism - static - dynamic
        //Static
        var math = Mathematics()
        println(math.sum())
        println(math.sum(3 , 4))
        println(math.sum(3 ,4 , 5))

        // Dynamic
        var animal = Animal()
        animal.sing()
        var dog = Dog()
        dog.sing()
        dog.test()


        // Abstaction - Interface
        // var myPeople = People()

        var myPiano = Piano()
        myPiano.brandName="YAMAHA"
        myPiano.digital=true
        println(myPiano.roomName)
        myPiano.info()
        myPiano.info2()


        //Lambda expression
        val testString = {myString:String-> println(myString) }
        testString("Test string")

        val multiply = {a:Int , b:Int -> a*b}
        multiply(5 , 4)

        val multiply2:(Int , Int)->Int = {a , b -> a*b}
        multiply2(5 , 5)

        //asynchronous

        fun downloadImage(url:String , completion : (Musician)->Unit){
            //url - download
            //data geldi falan yuklendi sonra
            val adele = Musician("adele" ,40 , "vocal" )
            completion(adele)
        }

        downloadImage("chrome.com") { musician ->  println(musician.name) }

        // Super key word
        var c = C()
        c.foo()
        c.bar()

        var d = D()
        d.foo()
        d.bar()

    }
}