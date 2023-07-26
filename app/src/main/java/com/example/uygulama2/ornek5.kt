package com.example.uygulama2

fun main() {
    val nameList = arrayListOf("ahmet", "mehmet", "ayşe", "feyza", "emir")
    println("Mevcut liste: $nameList")

    println(" indeksini girin:")
    val index = readLine()?.toIntOrNull()

    if (index != null && index >= 0 && index < nameList.size) {
        println("Yeni ismi girin:")
        val newName = readLine()?.trim()

        if (!newName.isNullOrEmpty()) {
            updateNameAtIndex(nameList, index, newName)
            println("Güncellenmiş liste: $nameList")
        } else {
            println("Geçersiz veya boş bir isim girdiniz.")
        }
    } else {
        println("Geçersiz indeks numarası girdiniz.")
    }
}

fun updateNameAtIndex(nameList: ArrayList<String>, index: Int, newName: String) {
    nameList[index] = newName
}
