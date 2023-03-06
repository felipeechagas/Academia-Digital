package com.academiadigital.academiaDigital.controller;

import com.academiadigital.academiaDigital.model.Aluno;
import com.academiadigital.academiaDigital.model.form.AlunoForm;
import com.academiadigital.academiaDigital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

  @Autowired
  private AlunoServiceImpl alunoService;

  @GetMapping
  public List<Aluno> getAll(){
    return alunoService.getAll();
  }
  @PostMapping
  public Aluno create(@RequestBody AlunoForm alunoForm){
    return alunoService.create(alunoForm);
  }
}
