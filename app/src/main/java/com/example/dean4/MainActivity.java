package com.example.dean4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn=(Button) findViewById(R.id.btn);

    }

    public void click(View view) {

        i++;
        btn.setText("This is a click number: "+ i);

        if(i%7==0)
        {
            btn.setText("Boom!"+ i);
        }

    }
}