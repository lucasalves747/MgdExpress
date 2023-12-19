package com.mgdExpress.request

import android.os.AsyncTask
import com.google.gson.Gson
import com.mgdExpress.model.ModelAceitarGerente
import okhttp3.OkHttpClient
import okhttp3.Request

class ReqSolicitacoes() : AsyncTask<Void, Void, String>()  {
    var authToken:String? = null
    override fun doInBackground(vararg p0: Void?): String {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("https://mgdexpressapi-production.up.railway.app/gerente-temporario")
            .get()
            .addHeader("Authorization", "Bearer ${authToken}")
            .addHeader("Content-Type", "application/json")
            .build()

        client.newCall(request).execute().use { response ->
            if (!response.isSuccessful) throw Exception("Erro na requisição: $response")

            return response.body!!.string()
        }
    }

    fun reqSolicitarGerentes(Token:String?):List<ModelAceitarGerente>{
        authToken = Token
        val gson = Gson()

        val jsonString = ReqSolicitacoes().execute().get()
        return gson.fromJson(jsonString, Array<ModelAceitarGerente>::class.java).toList()
    }

}