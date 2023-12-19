package com.mgdExpress.ui.pedidosDisponiveis

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.mgdExpress.databinding.FragmentPedidosDisponiveisBinding
class PedidosDisponiveisFragment : Fragment() {

    private lateinit var binding: FragmentPedidosDisponiveisBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPedidosDisponiveisBinding.inflate(inflater,container,false)
        return binding.root
    }
}