package com.academiadigital.academiaDigital.model;

import java.time.LocalDateTime;

public class AvaliacaoFisica {

  private Long id;
  private Aluno aluno;
  private LocalDateTime dataAvalicao = LocalDateTime.now();
  private double peso;
  private double altura;

}
