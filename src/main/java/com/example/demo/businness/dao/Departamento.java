package com.example.demo.businness.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Departamento {

  @SerializedName("Id")
  @Expose
  private String id;
  @SerializedName("Nombre")
  @Expose
  private String nombre;
  @SerializedName("Estado")
  @Expose
  private String estado;
}
