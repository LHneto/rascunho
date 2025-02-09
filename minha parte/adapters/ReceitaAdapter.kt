package com.example.meubolso.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meubolso.R
import com.example.meubolso.models.Receita
import kotlinx.android.synthetic.main.item_receita.view.*

class ReceitaAdapter(private val listaReceitas: List<Receita>) : RecyclerView.Adapter<ReceitaAdapter.ReceitaViewHolder>() {

    class ReceitaViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(receita: Receita) {
            itemView.txtNomeReceita.text = receita.nome
            itemView.txtValorReceita.text = "R$ ${"%.2f".format(receita.valor)}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReceitaViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_receita, parent, false)
        return ReceitaViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReceitaViewHolder, position: Int) {
        holder.bind(listaReceitas[position])
    }

    override fun getItemCount(): Int = listaReceitas.size
}
