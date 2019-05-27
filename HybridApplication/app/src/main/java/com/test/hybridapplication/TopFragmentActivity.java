package com.test.hybridapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.fragment.app.Fragment;

public class TopFragmentActivity extends Fragment {

    public TopFragmentActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.topframent_layout, container, false);

         WebView webView;
         WebSettings webViewSetting;
         String webUrlLocal = getArguments().getString("webUrlLocal");

        webView = (WebView)v.findViewById(R.id.testwebView);
        webViewSetting= webView.getSettings();
        webViewSetting.setJavaScriptEnabled(true);
        webViewSetting.setLoadWithOverviewMode(true);
        webView.setWebViewClient(new WebViewClient(){});
        webView.loadUrl(webUrlLocal);

        return v;
    }

}


