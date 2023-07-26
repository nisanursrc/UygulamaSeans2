package com.example.uygulama2

class Otomobil(hiz: Double, yakitTuketimi: Double, val bagajHacmi: Double) : Arac(hiz, yakitTuketimi) {

    fun bagajAc() {
        println("Bagaj açılıyor...")
    }
}