package com.shashanksp.kott.ui.auth

interface AuthListener {
    fun onStarted()
    fun onSuccess()
    fun onFailure(message : String)
}