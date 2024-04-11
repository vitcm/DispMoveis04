package com.example.dispmoveis04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = ((EditText) findViewById(R.id.editTextNome)).getText().toString();
                String cpf = ((EditText) findViewById(R.id.editTextCPF)).getText().toString();
                String dataNascimento = ((EditText) findViewById(R.id.editTextDataNascimento)).getText().toString();
                String telefone = ((EditText) findViewById(R.id.editTextTelefone)).getText().toString();
                String celular = ((EditText) findViewById(R.id.editTextCelular)).getText().toString();
                String email = ((EditText) findViewById(R.id.editTextEmail)).getText().toString();

                Intent intent = new Intent(MainActivity.this, DisplayPersonActivity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("cpf", cpf);
                intent.putExtra("dataNascimento", dataNascimento);
                intent.putExtra("telefone", telefone);
                intent.putExtra("celular", celular);
                intent.putExtra("email", email);
                startActivity(intent);
            }
        });
    }
}