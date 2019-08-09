package com.liberty.myapplication.activity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import static com.liberty.myapplication.MainActivity.GLOBAL_TAG;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(GLOBAL_TAG,"------onCreate------");
        Log.d(GLOBAL_TAG,"onCreate: "+getClass().getSimpleName()+" taskId: "+getTaskId()+" hashCode: "+hashCode());
        dumpTaskAffinity();
        getSupportActionBar().setTitle(getClass().getSimpleName());
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(GLOBAL_TAG,"------onNewIntent------");
        Log.d(GLOBAL_TAG,"onNewIntent: "+getClass().getSimpleName()+" taskId: "+getTaskId()+" hashCode: "+hashCode());
        dumpTaskAffinity();
    }

    protected void dumpTaskAffinity() {
        try {
            ActivityInfo activityInfo = getPackageManager().getActivityInfo(getComponentName(), PackageManager.GET_META_DATA);
            Log.d(GLOBAL_TAG, "taskAffinity: " + activityInfo.taskAffinity);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
