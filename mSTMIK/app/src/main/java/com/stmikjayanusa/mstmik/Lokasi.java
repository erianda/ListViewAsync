package com.stmikjayanusa.mstmik;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Aldo on 22/05/16.
 */
public class Lokasi extends AppCompatActivity {
    private WebView webView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lokasi);

        webView = (WebView) findViewById(R.id.lokasiMap);
        webView.setWebViewClient(new MyWebViewClient());

        String url = "https://www.google.com/maps/@-0.9434854,100.353932,20z";
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);

    }
    private class MyWebViewClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
