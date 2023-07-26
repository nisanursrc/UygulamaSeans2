package com.example.uygulama2

fun main() {
    // "Otomobil" nesnesi oluşturuyoruz
    val otomobil1 = Otomobil(150.0, 7.5, 400.0)

    // "Arac" sınıfından gelen metotları çağırıyoruz
    otomobil1.hizArtir(20.0)
    otomobil1.yakitTuketiminiGoster()

    // "Otomobil" sınıfına ait metodu çağırıyoruz
    otomobil1.bagajAc()
}