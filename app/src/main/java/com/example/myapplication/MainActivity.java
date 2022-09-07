package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView text_my_application;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_my_application = (TextView)findViewById(R.id.text_my_application);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        text_my_application.setText("Ping!");
    }

    public void changeColor(View view) {
        text_my_application.setTextColor(Color.RED);
    }
}