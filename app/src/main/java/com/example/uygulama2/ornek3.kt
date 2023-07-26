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

    // Sesli harfleri belirlemek için regex kullanıyoruz
    val sesliHarflerRegex = "[aeiouAEIOU]"


    return metin.replace(sesliHarflerRegex, "")
}
