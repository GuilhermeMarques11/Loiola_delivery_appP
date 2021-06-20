package br.com.local.loiola_delivery_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FacaPedidos_Activity extends AppCompatActivity {



    Button btnPizzaG, btnPromocoes, btnBebidas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {



        super.onCreate(savedInstanceState);
        setContentView(R.layout.faca_pedidos_layout);

        btnPizzaG = findViewById(R.id.btnPizzaG);
        btnPromocoes = findViewById(R.id.btnPromocoes);
        btnBebidas = findViewById(R.id.btnBebidas);


        btnPizzaG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), TabPizza_Activity.class));
            }
        });

        btnPromocoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Promocoes_Activity.class));
            }
        });

        btnBebidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TabBebidas_Activity.class));
            }
        });






    }
}