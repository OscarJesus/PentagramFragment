package com.oscarjesus.mascotas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaMascotas = (RecyclerView) findViewById(R.id.rvMascostas);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);

        listaMascotas.setLayoutManager(llm);

        inicializarListaMascotas();
        inicializarAdaptador();

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
        mascotas.add(new Mascota(R.drawable.perrito_4, "Anni"));
        mascotas.add(new Mascota(R.drawable.perrito_5, "Buggie"));
        mascotas.add(new Mascota(R.drawable.perrito_6, "Toby"));
        mascotas.add(new Mascota(R.drawable.perrito_7, "Doki"));
        mascotas.add(new Mascota(R.drawable.perrito_8, "Camilo"));
        mascotas.add(new Mascota(R.drawable.perrito_9, "Bruno"));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.mAbout:
                break;

            case R.id.mSettings:
                break;

            case R.id.mFav:
                Intent intent = new Intent(this, MascotasFav.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
