package com.example.aldo.artimanus.views.Apis;

import com.example.aldo.artimanus.views.Models.Usuario;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface RegistrarUsuarioService {

    @Headers({"Content-Type:application/json"})
    @POST("RegistrarUsuario")
    Call<ResultadoRegistrar> RegistrarUsuario(@Body Usuario usuario);
}
