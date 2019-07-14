package com.measure.alcchallenge

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // sends you to the actiivity that loads the webView
        button_about_alc.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, AboutALC1::class.java)
            startActivity(intent)

        })

//        My Profile
        button_my_profile.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, MyProfile::class.java)
            startActivity(intent)
        })


//        class myWebClient : WebViewClient (){
//            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//                view.loadUrl(request)
//            }
//        }
    }
}
