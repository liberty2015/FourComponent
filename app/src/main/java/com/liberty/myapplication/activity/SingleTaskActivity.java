package com.liberty.myapplication.activity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.liberty.myapplication.R;

public class SingleTaskActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task);
    }

    public void openSingleTaskActivity(View view){
        startActivity(new Intent(this,SingleTaskActivity.class));
    }

    public void openOtherActivity(View view){
        startActivity(new Intent(this,OtherActivity.class));
    }
}
