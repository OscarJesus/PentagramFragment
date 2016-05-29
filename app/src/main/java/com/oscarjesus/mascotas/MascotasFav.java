package com.oscarjesus.mascotas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;

import java.util.ArrayList;

public class MascotasFav extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascotas_fav);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascostasFav);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void inicializarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas);
        listaMascotas.setAdapter(adaptador);
    }

    public void inicializarListaMascotas(){
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.perrito_1, "Mixta"));
        mascotas.add(new Mascota(R.drawable.perrito_2, "Bolita"));
        mascotas.add(new Mascota(R.drawable.perrito_3, "Kiara"));
        mascotas.add(new Mascota(R.drawable.perrito_8, "Camilo"));
        mascotas.add(new Mascota(R.drawable.perrito_9, "Bruno"));


    }


}
