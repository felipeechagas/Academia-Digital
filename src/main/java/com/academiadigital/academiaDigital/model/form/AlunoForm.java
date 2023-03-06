package com.academiadigital.academiaDigital.model.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {

  private String nome;
  private String cpf;
  private int idade;
  private String bairro;

}
