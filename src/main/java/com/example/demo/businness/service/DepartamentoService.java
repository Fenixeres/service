package com.example.demo.businness.service;

import com.example.demo.businness.dao.DepartamentoList;

import java.io.IOException;

public interface DepartamentoService {

    public DepartamentoList getDepartamentos() throws IOException;

}
