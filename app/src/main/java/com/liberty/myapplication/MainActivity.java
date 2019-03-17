package com.liberty.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.liberty.myapplication.activity.ActivityDemoActivity;
import com.liberty.myapplication.broadcastreceiver.BroadcastReceiverDemoActivity;
import com.liberty.myapplication.contentprovider.ContentProviderDemoActivity;
import com.liberty.myapplication.service.ServiceDemoActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Activity";

    public static final String GLOBAL_TAG = "FC";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        Log.d(GLOBAL_TAG, "--"+TAG+" onCreate--");
        setContentView(R.layout.activity_main);
    }

    public void openActivityDemo(View v) {
        startActivity(new Intent(this, ActivityDemoActivity.class));
    }

    public void openBroadcastReceiverDemo(View v) {
        startActivity(new Intent(this, BroadcastReceiverDemoActivity.class));
    }

    public void openContentProviderDemo(View v) {
        startActivity(new Intent(this, ContentProviderDemoActivity.class));
    }

    public void openServiceDemo(View v) {
        startActivity(new Intent(this, ServiceDemoActivity.class));
    }

}
