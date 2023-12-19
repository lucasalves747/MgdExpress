package com.mgdExpress.ui.aceitaGerente

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mgdExpress.MainActivity
import com.mgdExpress.databinding.FragmentAceitaGerenteBinding
import com.mgdExpress.request.ReqSolicitacoes


class AceitarGerente(context: Context) : Fragment() {

    private lateinit var binding: FragmentAceitaGerenteBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAceitaGerenteBinding.inflate(inflater,container,false)



        val recyclerView = binding.recicleyViewAceitarGerente
        val adapter = Adapter(requireContext(), ReqSolicitacoes().reqSolicitarGerentes(MainActivity().buscarTokenUsuario()))
        recyclerView.adapter =  adapter

        return binding.root
    }


}