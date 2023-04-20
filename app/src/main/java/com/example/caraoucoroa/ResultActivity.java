package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {

    private ImageView imageResultado;
    private Button buttonVoltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResultado = findViewById(R.id.imageResultado);
        buttonVoltar = findViewById(R.id.buttonVoltar);

        //Recuperar dados recebidos
        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0) { //Cara
            imageResultado.setImageResource(R.drawable.cara);
        }else { //Coroa
            imageResultado.setImageResource(R.drawable.coroa);
        }

        buttonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Encerra a activity
                finish();
            }
        });

    }
}