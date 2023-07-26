package com.example.uygulama2

//Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin. Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın


fun main() {

    val sayilarListesi = ArrayList<Int>()


    for (i in 1..5) {
        print(" $i. sayıyı giriniz: ")
        val sayi = readLine()?.toIntOrNull()

        if (sayi != null) {
            sayilarListesi.add(sayi)
        } else {
            println("Geçersiz ! Sayı giriniz.")
        }
    }


    val toplam = toplamHesapla(sayilarListesi)
    println(" sayıların toplamı: $toplam")
}

fun toplamHesapla(sayilar: ArrayList<Int>): Int {
    var toplam = 0
    for (sayi in sayilar) {
        toplam += sayi
    }
    return toplam
}
