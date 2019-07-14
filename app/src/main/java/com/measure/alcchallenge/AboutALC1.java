package com.measure.alcchallenge;

import android.net.http.SslError;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC1 extends AppCompatActivity {
  private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        webView = findViewById(R.id.webview_example);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();
            }

        });

        webView.loadUrl("https://andela.com/alc");
//        webView.setWebViewClient(new WebViewClient());
//        webView.loadUrl("https://andela.com/alc");


//        String url ="http://andela.com/alc";
//        WebView wv=(WebView) findViewById(R.id.webview_example);
//        wv.getSettings().setJavaScriptEnabled(true);
//        wv.getSettings().setPluginState(WebSettings.PluginState.ON);
//        wv.getSettings().setAllowFileAccess(true);
//        wv.loadUrl(url);
//        wv.setWebViewClient(new WebViewClient());





    }


}
