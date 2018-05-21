package com.example.aldo.artimanus.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.aldo.artimanus.R;

public class MenuPrincipalActivity extends AppCompatActivity {
    Button btnIrSubirProd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        btnIrSubirProd = (Button) findViewById(R.id.btnSubirP);

        btnIrSubirProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuPrincipalActivity.this, SubirProductoActivity.class);
                startActivity(i);
            }
        });
    }
}
