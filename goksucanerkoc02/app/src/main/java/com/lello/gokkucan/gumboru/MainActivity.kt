package com.lello.gokkucan.gumboru

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadWebpage()
    }

    fun loadWebpage() {

        // Enable javascript
        webview.settings.javaScriptEnabled = true

        webview.loadUrl("http://yunus.hacettepe.edu.tr/~goksucanerkoc/webfinal/")

    }
}
