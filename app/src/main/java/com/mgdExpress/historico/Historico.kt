package com.mgdExpress.historico

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mgdExpress.MainActivity
import com.mgdExpress.R
import com.mgdExpress.model.ListaHistorico
import com.mgdExpress.model.SubListaHistoricoDados

class Historico : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private val listaHistoricoMes = ArrayList<ListaHistorico>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historico)

        recyclerView = findViewById(R.id.recyclerViewHistorico)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        addDataToList()
        val adapter = HistoricoAdapter(listaHistoricoMes)
        recyclerView.adapter = adapter

    }

    private fun addDataToList() {
        val subLista = ArrayList<SubListaHistoricoDados>()
        subLista.add(SubListaHistoricoDados("10-12-2023","lacerda","rua cinco numero 125 bairro estancia paraopedba"))
        subLista.add(SubListaHistoricoDados("10-12-2023","lacerda","rua cinco numero 125 bairro estancia paraopedba"))
        subLista.add(SubListaHistoricoDados("10-12-2023","lacerda","rua cinco numero 125 bairro estancia paraopedba"))
        subLista.add(SubListaHistoricoDados("10-12-2023","lacerda","rua cinco numero 125 bairro estancia paraopedba"))
        subLista.add(SubListaHistoricoDados("10-12-2023","lacerda","rua cinco numero 125 bairro estancia paraopedba"))

        listaHistoricoMes.add(ListaHistorico("dezembro",subLista))
        listaHistoricoMes.add(ListaHistorico("janeiro",subLista))
        listaHistoricoMes.add(ListaHistorico("fevereiro",subLista))
        listaHistoricoMes.add(ListaHistorico("março",subLista))
    }

}}