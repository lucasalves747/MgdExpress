package com.mgdExpress.ui.aceitaGerente

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.mgdExpress.DetalhesSolicitacaoGerente
import com.mgdExpress.R
import com.mgdExpress.model.ModelAceitarGerente

class Adapter(val context : Context, val listaSolicitacaoGerente: List<ModelAceitarGerente>) :
    RecyclerView.Adapter<Adapter.GerenteHoder>() {

    class GerenteHoder(itensView: View) : RecyclerView.ViewHolder(itensView) {
        val button = itemView.findViewById<Button>(R.id.button_AceitarGerente)

        fun bind(itens : ModelAceitarGerente) {
            itemView.findViewById<TextView>(R.id.nome_AceitarGerente).text = itens.nome
            itemView.findViewById<TextView>(R.id.nomeDaLoja_AceitarGerente).text = itens.nomeDoEstabelecimento
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GerenteHoder =
        GerenteHoder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.itens_aceita_gerente,parent,false))


    override fun onBindViewHolder(holder: GerenteHoder, position: Int) {
        val solicitacaoGerente = listaSolicitacaoGerente[position]
        holder.bind(solicitacaoGerente)
        holder.button.setOnClickListener {
            val intent = Intent(context, DetalhesSolicitacaoGerente::class.java)
            intent.putExtra("id",solicitacaoGerente.id)
            ContextCompat.startActivity(context, intent, null)
        }
    }

    override fun getItemCount(): Int = listaSolicitacaoGerente.size

}