package com.example.guiadasavesparaibanas.controle;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.guiadasavesparaibanas.modelo.Ave;
import com.example.guiadasavesparaibanas.visao.ExpositorLista;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAves  {

    private FirebaseFirestore db;

    public GerenciadorAves(){
        this.db = FirebaseFirestore.getInstance();
    }

    public void listar(final ExpositorLista expositorLista){
        db.collection("aves")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        if (task.isSuccessful()) {
                            List<Ave> lista = new ArrayList<Ave>();
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Ave ave = new Ave(document.getId(), (String) document.getData().get("nome"), (String) document.getData().get("especie"), (String) document.getData().get("familia"), (String) document.getData().get("alimentacao"), (String) document.getData().get("habitat"));
                                lista.add(ave);
                            }
                            expositorLista.exibirLista(lista);
                        } else {
                            Log.w("[Guia Aves]", "Error getting documents.", task.getException());
                        }
                    }
                });
    }

}
