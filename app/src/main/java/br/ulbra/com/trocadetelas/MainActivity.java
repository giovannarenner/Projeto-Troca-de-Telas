package br.ulbra.com.trocadetelas;
import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;

import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {
    Button bttelaprincipal, bttela2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CarregarTelaPrincipal();
    }
    public void CarregarTelaPrincipal() {
        setContentView(R.layout.activity_main);
        bttela2 = (Button) findViewById(R.id.btnTela2);
        bttela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2(); } });
    }

    public void CarregarTela2() {
        setContentView(R.layout.tela2);
        bttelaprincipal = (Button) findViewById (R.id.bttelaprincipal);
        bttelaprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
    } }