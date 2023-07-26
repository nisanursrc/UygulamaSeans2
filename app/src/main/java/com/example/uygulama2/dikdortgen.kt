package com.example.uygulama2

//Dikdörtgen" sınıfı oluşturabiliriz. Kotlin'de sınıfları oluşturmak oldukça basit ve temiz bir şekilde gerçekleştirilebilir. İşte Kotlin dilinde nasıl yapılacağına dair bir örnek


class dikdortgen(uzunluk : Int , genislik : Int){
    val uzunluk = uzunluk
    val genislik = genislik
    fun alan() : Int{
        return uzunluk * genislik
    }
    fun cevre() : Int{
        return 2 *( uzunluk + genislik)
    }}