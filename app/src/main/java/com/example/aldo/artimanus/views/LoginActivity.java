package com.example.aldo.artimanus.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.aldo.artimanus.R;

public class LoginActivity extends AppCompatActivity {
    Button botonRegistrar, botonIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }
    public void goCreateAccount(View view){
        Intent intent = new Intent(this, RegistroActivity.class);
        startActivity(intent);

        botonRegistrar = findViewById(R.id.btnRegistrarse);
        botonIngresar = findViewById(R.id.login);

        botonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, MenuPrincipalActivity.class);
                startActivity(i);
            }
        });

        botonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RegistroActivity.class);
                startActivity(i);
            }
        });
    }

}
