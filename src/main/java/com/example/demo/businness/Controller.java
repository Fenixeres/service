package com.example.demo.businness;

import com.example.demo.businness.dao.DepartamentoList;
import com.example.demo.businness.dao.Person;
import com.example.demo.businness.service.DepartamentoService;
import java.io.IOException;

import com.example.demo.businness.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services/v1")
public class Controller {

  @Autowired
  private DepartamentoService departamentoService;

  @Autowired
  private PersonService personService;

  @GetMapping(
      value = "/list" )
  public DepartamentoList getGeonames() throws IOException {
    return departamentoService.getDepartamentos();
  }

  @GetMapping(
          value = "/person" )
  public Person getPerson(@RequestParam("dni") int dni) throws IOException {
    return personService.getPerson(dni);
  }

}
