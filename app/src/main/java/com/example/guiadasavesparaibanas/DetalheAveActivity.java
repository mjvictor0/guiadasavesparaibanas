package com.example.guiadasavesparaibanas;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.guiadasavesparaibanas.modelo.Ave;

public class DetalheAveActivity extends AppCompatActivity {

    private TextView tvDetalheAveNome;
    private TextView tvDetalheAveEspecie;
    private TextView tvDetalheAveFamilia;
    private TextView tvDetalheAveAlimentacao;
    private TextView tvDetalheAveHabitat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_ave);

        tvDetalheAveNome = findViewById(R.id.tvDetalheAveNome);
        tvDetalheAveEspecie = findViewById(R.id.tvDetalheAveEspecie);
        tvDetalheAveFamilia = findViewById(R.id.tvDetalheAveFamilia);
        tvDetalheAveAlimentacao = findViewById(R.id.tvDetalheAveAlimentacao);
        tvDetalheAveHabitat = findViewById(R.id.tvDetalheAveHabitat);

        Intent it = getIntent();
        Ave ave = (Ave)it.getSerializableExtra("ave");

        tvDetalheAveNome.setText(ave.getNome());
        tvDetalheAveEspecie.setText(ave.getEspecie());
        tvDetalheAveFamilia.setText(ave.getFamilia());
        tvDetalheAveAlimentacao.setText(ave.getAlimentacao());
        tvDetalheAveHabitat.setText(ave.getHabitat());
    }
}
