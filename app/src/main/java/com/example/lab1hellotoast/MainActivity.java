package com.example.lab1hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private Button btnToast;
private Button btnCount;
private TextView Countt;
private int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnToast=findViewById(R.id.button2);
        btnCount=findViewById(R.id.button3);
        Countt=findViewById(R.id.textView2);

        btnToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Toast.makeText(MainActivity.this,"Hello Toast!",Toast.LENGTH_LONG).show();

            }
        });
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count = count + 1;
                Countt.setText("" + count);
            }
        });
    }
}