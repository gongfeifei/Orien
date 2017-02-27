package com.example.lenovo.orien;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e("TAG", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Configuration configuration = getResources().getConfiguration();
                    // 当前是横屏
                    if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE) {
                        Log.i("TAG", "设为竖屏");
                        MainActivity.this
                                .setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
                    } else if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT) {

                        Log.i("TAG", "设为横屏");
                        MainActivity.this
                                .setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
                    }
                }

        });
    }

    @Override
    protected void onStart() {
        Log.e("TAG", "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.e("TAG", "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.e("TAG", "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.e("TAG", "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.e("TAG", "onDestroy");
        super.onDestroy();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        Log.e("TAG", "onConfigurationChanged");
        super.onConfigurationChanged(newConfig);
    }
}
