package com.example.guiadasavesparaibanas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class OrnitologiaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ornitologia);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
