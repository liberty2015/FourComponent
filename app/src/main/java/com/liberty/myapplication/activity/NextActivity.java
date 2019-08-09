package com.liberty.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.liberty.myapplication.R;

import static com.liberty.myapplication.MainActivity.GLOBAL_TAG;

public class NextActivity extends AppCompatActivity {

    private static final String TAG = NextActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(GLOBAL_TAG, "--" + TAG + " onCreate--");
        setContentView(R.layout.activity_next);
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
}
