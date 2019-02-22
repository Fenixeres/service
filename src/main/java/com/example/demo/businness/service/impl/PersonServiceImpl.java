package com.example.demo.businness.service.impl;

import com.example.demo.businness.dao.Person;
import com.example.demo.businness.dao.PersonDao;
import com.example.demo.businness.service.PersonService;
import com.example.demo.businness.utilitarios.RetrofitApi;
import com.example.demo.businness.utilitarios.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PersonServiceImpl extends Url implements PersonService {

    @Autowired
    RetrofitApi retrofitApi;

    @Override
    public Person getPerson(int dni) throws IOException {
        PersonDao apiPerson = retrofitApi.create(urlPerson, PersonDao.class);
        return retrofitApi.response(apiPerson.getPerson(dni));
    }
}
