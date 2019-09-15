package com.example.learn.to.read;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    protected WebView app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        app = (WebView) findViewById(R.id.app);

        //settings
        app.setInitialScale(1);
        app.getSettings().setUseWideViewPort(true);
        app.getSettings().setJavaScriptEnabled(true);

        app.getSettings().setLoadWithOverviewMode(true);
        app.getSettings().setAllowContentAccess(true);
        app.getSettings().setDomStorageEnabled(true);
        app.getSettings().setAllowFileAccessFromFileURLs(true);
        app.getSettings().setAllowUniversalAccessFromFileURLs(true);

        //load view
        app.loadUrl("file:///android_asset/app/index.html");
    }
}
