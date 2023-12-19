package com.mgdExpress.historico

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mgdExpress.R
import com.mgdExpress.model.ListaHistorico


class HistoricoAdapter (private val historicoLista: List<ListaHistorico>) : RecyclerView.Adapter<HistoricoAdapter.HistoricoListViewHoder>(){

    inner class HistoricoListViewHoder(itemView: View): RecyclerView.ViewHolder(itemView){
        val mes = itemView.findViewById<TextView>(R.id.mesTextView)
        val entregasItensHistorico = itemView.findViewById<RecyclerView>(R.id.subHistoricoRecyclerView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoricoListViewHoder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.historico_mes,parent,false)
        return HistoricoListViewHoder(view)
    }

    override fun getItemCount(): Int {
        return historicoLista.size
    }

    override fun onBindViewHolder(holder: HistoricoListViewHoder, position: Int) {
        val historicoListItens = historicoLista[position]
        holder.mes.text = historicoListItens.mes

        holder.entregasItensHistorico.setHasFixedSize(true)
        holder.entregasItensHistorico.layoutManager = LinearLayoutManager(holder.itemView.context)
        val adapter = SubHistoricoAdapter(historicoListItens.dadosHistorico)
        holder.entregasItensHistorico.adapter = adapter
    }
}