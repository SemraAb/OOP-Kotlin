package com.samra.kotlinoop

interface HouseDecoration {
    // 100% abstract - instans yaratmaq olmur
    // initialize ede bilmersen  var roomName = "kitchen" olmaz
    // java - initialize etmelisen
    // kotlinde bunu implement etdiyimiz siniflerde alib deyisdirmeliyik
    var roomName: String
}