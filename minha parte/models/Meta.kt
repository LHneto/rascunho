package com.example.meubolso.models

data class Meta(
    val id: Int,
    val nome: String,
    val valor: Double,
    val dataConclusao: String, // Formato dd/MM/yyyy
    val descricao: String
)
