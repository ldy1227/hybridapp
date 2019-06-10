package com.test.hybridapplication;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private final int TOP_FRAGMENT1 = 1;
    private final int TOP_FRAGMENT2 = 2;
    private final int TOP_FRAGMENT3 = 3;
    private final int TOP_FRAGMENT4 = 4;
    private final int BT_FRAGMENT1 = 5;
    private final int BT_FRAGMENT2 = 6;
    private final int BT_FRAGMENT3 = 7;
    private final int BT_FRAGMENT4 = 8;
    private final int BT_FRAGMENT5 = 9;
    private final int BT_FRAGMENT6 = 10;
    private final int BT_FRAGMENT7 = 11;
    private final int BT_FRAGMENT8 = 12;




    private Button top_tab1, top_tab2, top_tab3, top_tab4;
    private Button bt_tab1, bt_tab2, bt_tab3, bt_tab4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 위젯에 대한 참조
        top_tab1 = (Button) findViewById(R.id.top_tab1);
        top_tab2 = (Button) findViewById(R.id.top_tab2);
        top_tab3 = (Button) findViewById(R.id.top_tab3);
        top_tab4 = (Button) findViewById(R.id.top_tab4);

        bt_tab1 = (Button) findViewById(R.id.bt_tab1);
        bt_tab2 = (Button) findViewById(R.id.bt_tab2);
        bt_tab3 = (Button) findViewById(R.id.bt_tab3);
        bt_tab4 = (Button) findViewById(R.id.bt_tab4);


        // 탭 버튼에 대한 리스너 연결
        top_tab1.setOnClickListener(this);
        top_tab2.setOnClickListener(this);
        top_tab3.setOnClickListener(this);
        top_tab4.setOnClickListener(this);

        bt_tab1.setOnClickListener(this);
        bt_tab2.setOnClickListener(this);
        bt_tab3.setOnClickListener(this);
        bt_tab4.setOnClickListener(this);


        // 임의로 액티비티 호출 시점에 어느 프레그먼트를 프레임레이아웃에 띄울 것인지를 정함


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.top_tab1:
                // '탑 버튼1' 클릭 시 '프래그먼트2' 호출
                finalCallFragment(TOP_FRAGMENT1);
                Log.d("Fragment Value", "top_tab1 : "+ TOP_FRAGMENT1);
                break;

            case R.id.top_tab2:
                // '탑 버튼2' 클릭 시 '프래그먼트2' 호출
                finalCallFragment(TOP_FRAGMENT2);
                Log.d("Fragment Value", "top_tab2 : "+ TOP_FRAGMENT2);
                break;

            case R.id.top_tab3:
                // '탑 버튼3' 클릭 시 '프래그먼트2' 호출
                finalCallFragment(TOP_FRAGMENT3);
                Log.d("Fragment Value", "top_tab3 : "+ TOP_FRAGMENT3);
                break;

            case R.id.top_tab4:
                // '탑 버튼4' 클릭 시 '프래그먼트2' 호출
                finalCallFragment(TOP_FRAGMENT4);
                Log.d("Fragment Value", "top_tab4 : "+ TOP_FRAGMENT4);
                break;

            case R.id.bt_tab1:
                // '바텀 버튼1' 클릭 시 '프래그먼트1' 호출
                finalCallFragment(BT_FRAGMENT1);
                Log.d("Fragment Value", "bottom_tab1 : "+ BT_FRAGMENT1);
                break;

            case R.id.bt_tab2:
                // '바텀 버튼2' 클릭 시 '프래그먼트2' 호출
                finalCallFragment(BT_FRAGMENT2);
                Log.d("Fragment Value", "bottom_tab2 : "+ BT_FRAGMENT2);
                break;

            case R.id.bt_tab3:
                // '바텀 버튼3' 클릭 시 '프래그먼트3' 호출
                finalCallFragment(BT_FRAGMENT3);
                Log.d("Fragment Value", "bottom_tab3 : "+ BT_FRAGMENT3);
                break;

            case R.id.bt_tab4:
                // '바텀 버튼4' 클릭 시 '프래그먼트4' 호출
                finalCallFragment(BT_FRAGMENT4);
                Log.d("Fragment Value", "bottom_tab4 : "+ BT_FRAGMENT4);
                break;

        }
    }

    private void finalCallFragment(int frament_no){
        String webUrlLocal =null ;
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        switch (frament_no) {
            case 1:
                webUrlLocal = "https://naver.com";
                break;
            case 2:
                webUrlLocal = "https://naver.com";
                break;
            case 3:
                webUrlLocal = "https://naver.com";
                break;
            case 4:
                webUrlLocal = "https://naver.com";
                break;
            case 5:
                webUrlLocal = "https://naver.com";
                break;
            case 6:
                webUrlLocal = "https://google.com";
                break;
            case 7:
                webUrlLocal = "https://daum.net";
                break;
            case 8:
                webUrlLocal = "https://yahoo.com";
                break;

        }
        TopFragmentActivity fragment1 = new TopFragmentActivity();
        Bundle bundle = new Bundle(1); // 파라미터는 전달할 데이터 개수

        bundle.putString("webUrlLocal", webUrlLocal); // key , value
        fragment1.setArguments(bundle);
        transaction.replace(R.id.fragment_container, fragment1);
        transaction.commit();


    }
}
/*public class MainActivity extends AppCompatActivity {
    private WebView webView;
    private WebSettings webViewSetting;
    private String webUrlLocal  = "https://naver.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView = (WebView)findViewById(R.id.testwebView);
        webViewSetting= webView.getSettings();

        webViewSetting.setJavaScriptEnabled(true);
        webViewSetting.setLoadWithOverviewMode(true);
        webView.setWebViewClient(new WebViewClient(){});
        webView.loadUrl(webUrlLocal);

    }*/

