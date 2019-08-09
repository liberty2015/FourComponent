package com.liberty.myapplication.activity;

import android.content.pm.ActivityInfo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.liberty.myapplication.R;

import static com.liberty.myapplication.MainActivity.GLOBAL_TAG;

public class AbnormalActivity extends AppCompatActivity {

    private static final String TAG = AbnormalActivity.class.getSimpleName();
    private int orientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(GLOBAL_TAG, "--" + TAG + " onCreate--: " + savedInstanceState);
        setContentView(R.layout.activity_abnormal);
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
    public void onBackPressed() {
        super.onBackPressed();
        Log.d(GLOBAL_TAG, "--" + TAG + " onBackPressed--");

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d(GLOBAL_TAG, "--" + TAG + " onSaveInstanceState--");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(GLOBAL_TAG, "--" + TAG + " onRestoreInstanceState--");
    }

}
