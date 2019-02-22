package com.example.demo.businness.dao;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface PersonDao {

    @GET("/dni/{dni}")
    Call<Person> getPerson(@Path("dni")int dni);
}
