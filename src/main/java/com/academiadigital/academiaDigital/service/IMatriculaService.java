package com.academiadigital.academiaDigital.service;

import com.academiadigital.academiaDigital.model.Matricula;
import com.academiadigital.academiaDigital.model.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

  Matricula create(MatriculaForm matriculaForm);

  Matricula get(Long id);

  List<Matricula> getAll();

  void delete(Long id);
}
