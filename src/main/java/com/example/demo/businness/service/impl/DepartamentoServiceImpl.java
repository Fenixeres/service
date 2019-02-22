package com.example.demo.businness.service.impl;

import com.example.demo.businness.dao.DepartamentoList;
import com.example.demo.businness.dao.DepartamentoDao;
import com.example.demo.businness.service.DepartamentoService;

import java.io.IOException;

import com.example.demo.businness.utilitarios.RetrofitApi;
import com.example.demo.businness.utilitarios.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartamentoServiceImpl extends Url implements DepartamentoService {

    @Autowired
    RetrofitApi retrofitApi;

    @Override
    public DepartamentoList getDepartamentos() throws IOException {
        DepartamentoDao apiDepartamento = retrofitApi.create(urlDepartamento, DepartamentoDao.class);
        return retrofitApi.response(apiDepartamento.getDepartamentos());
    }

}
