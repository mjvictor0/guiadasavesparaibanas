package com.example.guiadasavesparaibanas.visao;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guiadasavesparaibanas.R;
import com.example.guiadasavesparaibanas.controle.GerenciadorAves;
import com.example.guiadasavesparaibanas.modelo.Ave;

import java.util.ArrayList;
import java.util.List;

public class ListaActivity extends AppCompatActivity implements ExpositorLista, AdapterView.OnItemClickListener {

    private GerenciadorAves gerenciadorAves;

    private List<Ave> lista;
    private ListView lvAves;
    private ArrayAdapter<Ave> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gerenciadorAves = new GerenciadorAves();

        lvAves = findViewById(R.id.lvAves);
        lista = new ArrayList<Ave>();
        adapter = new ArrayAdapter<Ave>(this, android.R.layout.simple_list_item_1, lista);
        lvAves.setAdapter(adapter);

        lvAves.setOnItemClickListener(this);

        gerenciadorAves.listar(this);
    }


    @Override
    public void exibirLista(List<Ave> lista) {
        this.lista = lista;
        Log.d("[Guia Aves]", String.valueOf(lista.size()));
        adapter = new ArrayAdapter<Ave>(this, android.R.layout.simple_list_item_1, lista);
        lvAves.setAdapter(adapter);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, lista.get(i).getNome(), Toast.LENGTH_SHORT).show();
        Intent it = new Intent(this, DetalheAveActivity.class);
        it.putExtra("ave", lista.get(i));
        startActivity(it);
    }
}
