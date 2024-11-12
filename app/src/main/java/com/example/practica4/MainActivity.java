package com.example.practica4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText nota;
    Button agregar, eliminar;
    ListView lNotas;
    ArrayList<String> ListaNotas = new ArrayList<>();
    ArrayAdapter<String> lAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nota = findViewById(R.id.txtNota);
        agregar = findViewById(R.id.btnAgregar);
        eliminar = findViewById(R.id.btnEliminar);
        lNotas = findViewById(R.id.listaNotas);

    }
}

