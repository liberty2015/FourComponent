package com.liberty.myapplication.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.liberty.myapplication.R;

public class StandardActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard);
    }

    public void openStandardActivity(View view){
        startActivity(new Intent(this,StandardActivity.class));
    }

    public void openOtherActivity(View view){
        startActivity(new Intent(this,OtherActivity.class));
    }
}
