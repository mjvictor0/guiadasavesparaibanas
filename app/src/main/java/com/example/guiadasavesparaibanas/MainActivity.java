package com.example.guiadasavesparaibanas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lista(View v){
        Toast.makeText(this, "lista", Toast.LENGTH_SHORT).show();
    }

    public void importancia(View v){
        Intent it = new Intent(this,ImportanciaActivity.class);
        startActivity(it);
    }

    public void problematica(View v){
        Intent it = new Intent(this,ProblematicaActivity.class);
        startActivity(it);
    }

    public void ornitologia(View v) {
        Intent it = new Intent(this, OrnitologiaActivity.class);
        startActivity(it);
    }
}
