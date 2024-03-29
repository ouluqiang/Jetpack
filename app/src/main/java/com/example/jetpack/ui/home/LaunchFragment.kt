package com.example.jetpack.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.findNavController
import com.example.jetpack.R
import kotlinx.android.synthetic.main.launch_fragment.*


class LaunchFragment : Fragment() {

    companion object {
        fun newInstance() = LaunchFragment()
    }

    private lateinit var viewModel: LaunchViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.launch_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LaunchViewModel::class.java)
        // TODO: Use the ViewModel
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
        textView.setOnClickListener {
            //传值
            var args=LaunchFragmentDirections.actionLaunchFragmentToMainFragment()
            args.setTag("好好")
            findNavController().navigate(args)
//            findNavController().navigate(R.id.action_launchFragment_to_loginFragment)
        }
    }

}
