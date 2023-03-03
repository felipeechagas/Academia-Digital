package com.academiadigital.academiaDigital.service;

import com.academiadigital.academiaDigital.model.Matricula;

import java.util.List;

public interface MatriculaService {

  Matricula create(MatriculaForm form);

  Matricula get(Long id);

  List<Matricula> getAll();

  void delete(Long id);
}
