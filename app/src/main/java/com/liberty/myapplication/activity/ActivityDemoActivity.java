package com.liberty.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.liberty.myapplication.R;

import static com.liberty.myapplication.MainActivity.GLOBAL_TAG;

public class ActivityDemoActivity extends AppCompatActivity {

    private static final String TAG = ActivityDemoActivity.class.getSimpleName();

    private boolean once = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(GLOBAL_TAG, "--" + TAG + " onCreate");
        setContentView(R.layout.activity_demo_activity);
    }

    public void openNextActivity(View view) {
        startActivity(new Intent(this, NextActivity.class));
    }

    public void openAbnormalStateActivity(View view){
        startActivity(new Intent(this, AbnormalActivity.class));
    }

    public void openAbnormalState2Activity(View view){
        startActivity(new Intent(this, Abnormal2Activity.class));
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
        if (once) {
            String text = "启动一个新的Activity：onCreate -> onStart -> onResume";
            Toast.makeText(this, text, Toast.LENGTH_LONG).show();
            once = false;
        } else {

        }
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
