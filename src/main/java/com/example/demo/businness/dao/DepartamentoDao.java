package com.example.demo.businness.dao;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DepartamentoDao {

  @GET("/address-services/v1/departmentsAll")
  Call<DepartamentoList> getDepartamentos();

}
