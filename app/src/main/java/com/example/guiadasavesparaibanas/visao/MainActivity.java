package com.example.guiadasavesparaibanas.visao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guiadasavesparaibanas.R;
import com.example.guiadasavesparaibanas.controle.GerenciadorAves;
import com.google.firebase.firestore.FirebaseFirestore;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lista(View v){

        Intent it = new Intent(this, ListaActivity.class);
        startActivity(it);
    }

    public void importancia(View v){
        Intent it = new Intent(this, ImportanciaActivity.class);
        startActivity(it);
    }

    public void problematica(View v){
        Intent it = new Intent(this, ProblematicaActivity.class);
        startActivity(it);
    }

    public void ornitologia(View v) {
        Intent it = new Intent(this, OrnitologiaActivity.class);
        startActivity(it);
    }
}
