package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView browser=(WebView)findViewById(R.id.webBrowser);
        WebSettings webSettings=browser.getSettings();
        webSettings.setJavaScriptEnabled(true);
        browser.loadData("<html><body><h2>Hello</h2></body></html>","text/html","UTF-8");

    }
}