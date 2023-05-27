package com.shashanksp.kott.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.shashanksp.kott.R
import com.shashanksp.kott.databinding.ActivityLoginBinding
import com.shashanksp.kott.ui.util.toast

class LoginActivity : AppCompatActivity(),AuthListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding :ActivityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login)
        val viewModel = ViewModelProvider(this).get(AuthViewModel::class.java)
        binding.viewmodel  = viewModel
        viewModel.authListener = this
//        setContentView(R.layout.activity_login)
    }

    override fun onStarted() {
        toast("Login Started")
    }

    override fun onSuccess() {
        toast("Login Success")
    }

    override fun onFailure(message: String) {
        toast(message)
    }
}