package com.example.demo.businness.dao;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {
    @Expose
    private String dni;
    @SerializedName("cui")
    @Expose
    private Integer cui;
    @SerializedName("apellido_paterno")
    @Expose
    private String apellidoPaterno;
    @SerializedName("apellido_materno")
    @Expose
    private String apellidoMaterno;
    @SerializedName("nombres")
    @Expose
    private String nombres;

}
