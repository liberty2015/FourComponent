package com.liberty.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.liberty.myapplication.R;

public class OtherActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
    }

    public void openStandardActivity(View view){
        startActivity(new Intent(this,StandardActivity.class));
    }

    public void openSingleTopActivity(View view){
        startActivity(new Intent(this,SingleTopActivity.class));
    }

    public void openSingleTaskActivity(View view){
        startActivity(new Intent(this,SingleTaskActivity.class));
    }

    public void openSingleInstanceActivity(View view){
        startActivity(new Intent(this,SingleInstanceActivity.class));
    }
}
