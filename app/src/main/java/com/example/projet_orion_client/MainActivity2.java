package com.example.projet_orion_client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    private TextView textView;

    private Configuration configuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        configuration = Configuration.getInstance();

        textView = findViewById(R.id.textView);

        String movie = getIntent().getStringExtra("movie");

        textView.setText(movie);
    }
}