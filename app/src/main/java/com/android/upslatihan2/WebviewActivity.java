package com.android.upslatihan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebviewActivity extends AppCompatActivity {
    WebView webViewYt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);

        //inisialisasi
        webViewYt = (WebView) findViewById(R.id.wv_youtube);

        //attribut
        webViewYt.loadUrl("https://m.youtube.com/");
        webViewYt.getSettings().setJavaScriptEnabled(true);
        webViewYt.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(webViewYt.canGoBack()){
            webViewYt.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
