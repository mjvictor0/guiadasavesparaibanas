package com.example.guiadasavesparaibanas.visao;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guiadasavesparaibanas.R;

public class ProblematicaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problematica);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}

}
