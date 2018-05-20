package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     String textview1;
     Button btn;
     EditText tx;
     TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// get the button
        btn = (Button) findViewById(R.id.btnDosomething);
        tx = (EditText) findViewById(R.id.editText);
        tv = (TextView)findViewById(R.id.textView);
        //set what happens when user clicks


        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String str = tx.getText().toString();
                tv.setText(str);
            }
        });
    }
}
