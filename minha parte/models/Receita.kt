package com.example.meubolso.models

data class Receita(
    val id: Int,
    val nome: String,
    val valor: Double,
    val data: String // Formato dd/MM/yyyy
)
