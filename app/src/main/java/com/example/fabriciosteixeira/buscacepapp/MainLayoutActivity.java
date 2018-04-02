package com.example.fabriciosteixeira.buscacepapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class MainLayoutActivity extends AppCompatActivity {

    public Button btnBuscarCep;
    public EditText cep;
    public TextView resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);

        cep = findViewById(R.id.etMain_cep);
        resposta = findViewById(R.id.eiMain_resposta);

        btnBuscarCep = (Button) findViewById(R.id.btnMain_buscarCep);

        btnBuscarCep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    CEP retorno = new HttpService
                            (cep.getText().toString()).execute().get();
                    resposta.setText(retorno.toString());
                } catch (ExecutionException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

    }
}
