package com.mgdExpress.model

data class ListaHistorico(val mes: String, val dadosHistorico: List<SubListaHistoricoDados>)

// InnerItem.kt
data class SubListaHistoricoDados(val data: String,val nomeEstabelecimento:String,val localDaEntrega:String)
