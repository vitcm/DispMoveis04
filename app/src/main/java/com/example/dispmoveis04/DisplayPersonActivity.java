package com.example.dispmoveis04;

import static com.example.dispmoveis04.Utils.getPreCadastrados;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class DisplayPersonActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_person);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString("nome");
            String cpf = extras.getString("cpf");
            String dataNascimento = extras.getString("dataNascimento");
            String telefone = extras.getString("telefone");
            String celular = extras.getString("celular");
            String email = extras.getString("email");

            TextView textViewNome = findViewById(R.id.textViewNome);
            TextView textViewCPF = findViewById(R.id.textViewCPF);
            TextView textViewDataNascimento = findViewById(R.id.textViewDataNascimento);
            TextView textViewTelefone = findViewById(R.id.textViewTelefone);
            TextView textViewCelular = findViewById(R.id.textViewCelular);
            TextView textViewEmail = findViewById(R.id.textViewEmail);

            textViewNome.setText("Nome: " + nome);
            textViewCPF.setText("CPF: " + cpf);
            textViewDataNascimento.setText("Data de Nascimento: " + dataNascimento);
            textViewTelefone.setText("Telefone: " + telefone);
            textViewCelular.setText("Celular: " + celular);
            textViewEmail.setText("Email: " + email);

        }

        Button buttonCadastrarNovaPessoa = findViewById(R.id.buttonCadastrarNovaPessoa);
        buttonCadastrarNovaPessoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DisplayPersonActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Person> personList = getPreCadastrados();
        PersonAdapter adapter = new PersonAdapter(personList, this);
        recyclerView.setAdapter(adapter);
    }
}