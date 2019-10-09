package com.example.jetpack.ui.tab

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.jetpack.R

class ThreeFragment : Fragment() {

    companion object {
        fun newInstance() = ThreeFragment()
    }

    private lateinit var viewModel: ThreeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.three_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ThreeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
