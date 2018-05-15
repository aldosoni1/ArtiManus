package com.example.aldo.artimanus.views;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.aldo.artimanus.R;
import com.example.aldo.artimanus.views.Apis.RegistrarUsuarioService;
import com.example.aldo.artimanus.views.Apis.ResultadoRegistrar;
import com.example.aldo.artimanus.views.Models.Usuario;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RegistroActivity extends AppCompatActivity {
    private Retrofit retrofit;
    TextInputEditText nombre, apellidos, correoElectronico, password;
    Button btnRegistrarse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        nombre = (TextInputEditText) findViewById(R.id.txtNombre);
        apellidos = (TextInputEditText) findViewById(R.id.txtApellidos);
        correoElectronico = (TextInputEditText) findViewById(R.id.txtCorreo);
        password = (TextInputEditText) findViewById(R.id.txtPassword);
        btnRegistrarse = (Button) findViewById(R.id.btnRegistrarse);


        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/
        showToolbar(getResources().getString(R.string.toolbar_tittle_crear_cuenta), true);

        retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.92.201/api/Usuario/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        btnRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Usuario usuario = new Usuario();

                usuario.setNombre(nombre.getText().toString());
                usuario.setApellidos(apellidos.getText().toString());
                usuario.setCorreo(correoElectronico.getText().toString());
                usuario.setPassword(password.getText().toString());
                RegistrarUsuario(usuario);
            }
        });


    }
    private void RegistrarUsuario(Usuario usuario){

        RegistrarUsuarioService service = retrofit.create(RegistrarUsuarioService.class);
        final Call<ResultadoRegistrar> respuestaRegistrar = service.RegistrarUsuario(usuario);

        respuestaRegistrar.enqueue(new Callback<ResultadoRegistrar>() {
            @Override
            public void onResponse(Call<ResultadoRegistrar> call, Response<ResultadoRegistrar> response) {
                //Log.d("Completado",response.body().toString());
            }

            @Override
            public void onFailure(Call<ResultadoRegistrar> call, Throwable t) {
                Log.d("Error",t.toString());
            }
        });
    }
    public void showToolbar(String tittle, boolean upButton){
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle(tittle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(upButton);

    }

}
