package com.example.bancodedados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText editEmail;
    private EditText editSenha;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editEmail = findViewById(R.id.editEmailL);
        editSenha = findViewById(R.id.editSenhaL);
        btnLogin = findViewById(R.id.btnLogin);

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String email = editEmail.getText().toString();
//                String senha = editSenha.getText().toString();
//
//                if (verificarCredenciais(email, senha)) {
//                    Intent intent = new Intent(LoginActivity.this, ListarAlunosActivity.class);
//                    startActivity(intent);
//                } else {
//                    // Credenciais inválidas, mostre uma mensagem de erro
//                    Toast.makeText(LoginActivity.this, "Credenciais inválidas", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

}