package com.example.demo.businness.service;

import com.example.demo.businness.dao.Person;

import java.io.IOException;

public interface PersonService {
    public Person getPerson(int dni) throws IOException;
}
