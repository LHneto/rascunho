package com.example.meubolso.models

data class Gasto(
    val id: Int,
    val nome: String,
    val valor: Double,
    val categoria: String,
    val data: String // Formato dd/MM/yyyy
)
