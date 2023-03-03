package com.academiadigital.academiaDigital.service;

import com.academiadigital.academiaDigital.model.Aluno;
import jdk.dynalink.linker.LinkerServices;

import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoForm);

  Aluno get(Long id);

  List<Aluno> getAll();

  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete (Long id);
}
