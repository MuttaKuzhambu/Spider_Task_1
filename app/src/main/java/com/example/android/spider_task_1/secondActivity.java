package com.example.android.spider_task_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent2= getIntent();
        intent2.getStringExtra("ItemName");
        setContentView(R.layout.activity_second);
        TextView textView= (TextView) findViewById(R.id.new_text);
        textView.setText( intent2.getStringExtra("ItemName"));
    }
}
