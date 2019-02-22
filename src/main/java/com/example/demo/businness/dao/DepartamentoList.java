package com.example.demo.businness.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartamentoList {

  @SerializedName("Departamentos")
  @Expose
  private List<Departamento> departamentos = null;

}
