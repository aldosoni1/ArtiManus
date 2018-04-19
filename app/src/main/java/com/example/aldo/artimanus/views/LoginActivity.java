package com.example.aldo.artimanus.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aldo.artimanus.R;

public class LoginActivity extends AppCompatActivity {
    Button botonRegistrar, botonIngresar;
    TextInputEditText usuario, cont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        botonRegistrar = findViewById(R.id.registrar);
        botonIngresar = findViewById(R.id.login);


        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usuario = findViewById(R.id.username);
                cont = findViewById(R.id.password);
                String u = "root";
                String p = "pass15";
                if (usuario.getText().toString().equals(u) && cont.getText().toString().equals(p)) {
                    Intent i = new Intent(LoginActivity.this, MenuPrincipalActivity.class);
                    startActivity(i);
                }
            }
        });

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent int1 = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(int1);
            }
        });

    }

}
