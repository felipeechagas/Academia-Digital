package com.academiadigital.academiaDigital.service;

import com.academiadigital.academiaDigital.model.Aluno;
import com.academiadigital.academiaDigital.model.form.AlunoForm;
import com.academiadigital.academiaDigital.model.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoForm alunoForm);

  Aluno get(Long id);

  List<Aluno> getAll();

  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete(Long id);
}
