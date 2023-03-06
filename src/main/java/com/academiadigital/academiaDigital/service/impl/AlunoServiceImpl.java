package com.academiadigital.academiaDigital.service.impl;

import com.academiadigital.academiaDigital.model.Aluno;
import com.academiadigital.academiaDigital.model.form.AlunoForm;
import com.academiadigital.academiaDigital.model.form.AlunoUpdateForm;
import com.academiadigital.academiaDigital.repository.AlunoRepository;
import com.academiadigital.academiaDigital.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService {

  @Autowired
  private AlunoRepository alunoRepository;

  @Override
  public Aluno create(AlunoForm alunoForm) {
    Aluno aluno = new Aluno();
    aluno.setNome(alunoForm.getNome());
    aluno.setCpf(alunoForm.getCpf());
    aluno.setIdade(aluno.getIdade());
    aluno.setBairro(alunoForm.getBairro());

    return alunoRepository.save(aluno);
  }

  @Override
  public Aluno get(Long id) {

    return null;
  }

  @Override
  public List<Aluno> getAll() {
    return alunoRepository.findAll();
  }

  @Override
  public Aluno update(Long id, AlunoUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
