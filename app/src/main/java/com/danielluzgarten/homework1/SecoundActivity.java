package com.danielluzgarten.homework1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecoundActivity extends AppCompatActivity {
    int x = 0;
    int y = 0;
    int z = 0;
    TextView answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secound);
        Intent intent = getIntent();
        answer = (TextView)findViewById(R.id.txtViewResult);
        x = Integer.parseInt(intent.getStringExtra("number1"));
        y = Integer.parseInt(intent.getStringExtra("number2"));
        z = x+y;
        answer.setText(String.valueOf(z));
    }
}
