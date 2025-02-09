package com.example.meubolso.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.meubolso.R
import com.example.meubolso.models.Gasto
import kotlinx.android.synthetic.main.item_gasto.view.*

class GastoAdapter(private val listaGastos: List<Gasto>) : RecyclerView.Adapter<GastoAdapter.GastoViewHolder>() {

    class GastoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(gasto: Gasto) {
            itemView.txtNomeGasto.text = gasto.nome
            itemView.txtValorGasto.text = "R$ ${"%.2f".format(gasto.valor)}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GastoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_gasto, parent, false)
        return GastoViewHolder(view)
    }

    override fun onBindViewHolder(holder: GastoViewHolder, position: Int) {
        holder.bind(listaGastos[position])
    }

    override fun getItemCount(): Int = listaGastos.size
}
