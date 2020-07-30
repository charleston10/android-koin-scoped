package com.charleston.koinscoped

import android.os.Bundle
import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment : Fragment(R.layout.fragment_login), View.OnClickListener{

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_login.setOnClickListener(this)
        btn_register.setOnClickListener(this)
        btn_forgot.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.btn_forgot -> startScreen(R.id.action_loginFragment_to_forgotPasswordFragment)
           R.id.btn_register -> startScreen(R.id.action_loginFragment_to_registerFragment)
       }
    }

    private fun startScreen(@IdRes actionId: Int){
        findNavController().navigate(actionId)
    }
}