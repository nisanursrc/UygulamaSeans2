package com.example.uygulama2

//Bir string içindeki tüm sesli harfleri kaldıran bir fonksiyon yazın. Fonksiyon, kullanıcıdan alınan bir string içindeki tüm sesli harfleri kaldırarak yeni bir string döndürmelidir.

fun main() {

    print("Bir metin giriniz: ")
    val metin = readLine()


    val sesliHarfOlmayanMetin = kaldırSesliHarfler(metin)
    println("Sesli harf olmayan metin: $sesliHarfOlmayanMetin")
}

fun kaldırSesliHarfler(metin: String?): String {
    if (metin == null) return ""


    val sesliHarfler = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')


    val yeniMetin = StringBuilder()
    for (harf in metin) {
        if (harf !in sesliHarfler) {
            yeniMetin.append(harf)
        }
    }

    return yeniMetin.toString()
}

