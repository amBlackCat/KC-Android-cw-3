package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView Title = findViewById(R.id.title);
        ImageView catImage = findViewById(R.id.image);

        EditText firstNumber = findViewById(R.id.editText);
        EditText secondNumber = findViewById(R.id.editText2);

        Button Calculate = findViewById(R.id.calculateButton);
        TextView Total = findViewById(R.id.textView);



    }
}