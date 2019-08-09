package com.liberty.myapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.liberty.myapplication.R;

public class SingleInstanceActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_instance);
    }

    public void openSingleInstanceActivity(View view){
        startActivity(new Intent(this,SingleInstanceActivity.class));
    }

    public void openOtherActivity(View view){
        startActivity(new Intent(this,OtherActivity.class));
    }
}
