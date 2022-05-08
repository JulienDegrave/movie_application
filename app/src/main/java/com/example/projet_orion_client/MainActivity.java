package com.example.projet_orion_client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    private static final String TAG = "MainActivity";

    private Configuration configuration;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configuration = Configuration.getInstance();
    }

    public void onClick(View view) {
        Log.d(TAG, "J'ai cliqué !");

        Bundle bundle = new Bundle();
        bundle.putString("movie", "Uncharted");

        Intent intent = new Intent(this, MainActivity2.class);

        intent.putExtras(bundle);

        startActivity(intent);
    }
}