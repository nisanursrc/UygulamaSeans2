package com.example.uygulama2

//"Arac" adlı bir üst sınıf oluşturun ve bu sınıfta araçların hızı ve yakıt tüketimi gibi özellikleri tanımlayın. Ardından "Otomobil" adlı bir alt sınıf oluşturun ve bu sınıfta otomobil türüne özgü özellikleri ekleyin. "Otomobil" sınıfı "Arac" sınıfından kalıtım almalıdır. Otomobil sınıfında "bagajHacmi" adlı bir özelliği ve "bagajAc" adlı bir metodu ekleyin.

open class Arac(val hiz: Double, val yakitTuketimi: Double) {


    fun hizArtir(hizArtisi: Double) {
        println("Aracın hızı artırılıyor...")
        val yeniHiz = hiz + hizArtisi
        println("Yeni hız: $yeniHiz")
    }fun yakitTuketiminiGoster() {

        println("Araç yakıt tüketimi: $yakitTuketimi litre/100km")
    }}