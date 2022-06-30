package com.rubensth.myfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.rubensth.myfood.databinding.ActivityTelaEscolhaCardapioBinding;

public class TelaEscolhaCardapio extends AppCompatActivity {

    ActivityTelaEscolhaCardapioBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_escolha_cadastrar_cardapio);

        getSupportActionBar().hide();

        binding = ActivityTelaEscolhaCardapioBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btnCafeDaManha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CadastrarRefeicao.class);
                startActivity(intent);
            }
        });

    }
}