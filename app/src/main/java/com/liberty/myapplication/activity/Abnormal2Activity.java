package com.liberty.myapplication.activity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.liberty.myapplication.R;

import static com.liberty.myapplication.MainActivity.GLOBAL_TAG;

public class Abnormal2Activity extends AppCompatActivity {

    private static final String TAG = Abnormal2Activity.class.getSimpleName();
    private int orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abnormal2);
    }

    public void changeOrientation(View view) {
        if (orientation == ActivityInfo.SCREEN_ORIENTATION_PORTRAIT) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            orientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;
        } else if (orientation == ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(GLOBAL_TAG, "--" + TAG + " onStart--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(GLOBAL_TAG, "--" + TAG + " onRestart--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(GLOBAL_TAG, "--" + TAG + " onResume--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(GLOBAL_TAG, "--" + TAG + " onPause--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(GLOBAL_TAG, "--" + TAG + " onStop--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(GLOBAL_TAG, "--" + TAG + " onDestroy--");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(GLOBAL_TAG, "--" + GLOBAL_TAG + " onConfigurationChanged--");
    }
}
