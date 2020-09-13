package com.example.mixnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class LoginActivity extends AppCompatActivity {
    String url;
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        url=getIntent().getStringExtra("url");
        web=(WebView) findViewById(R.id.web1);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl(url);

        WebSettings webSettings= web.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if(web.canGoBack())
        {
            web.goBack();
        }else
        {

            super.onBackPressed();
        }

    }
}