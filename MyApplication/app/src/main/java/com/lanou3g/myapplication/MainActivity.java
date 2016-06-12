package com.lanou3g.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.turn_QQQ);

        textView.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,QQQAty.class);
        startActivity(intent);
    }
    //向你扔出一个异常
}
