package com.example.demo.businness.dao;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class GeonameParams implements Serializable {

  private static final long serialVersionUID = 1L;

  private String north;

  private String south;

  private String east;

  private String west;

  private String lang;

  private String username;

}
