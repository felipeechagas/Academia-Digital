package com.academiadigital.academiaDigital.service;

import com.academiadigital.academiaDigital.model.AvaliacaoFisica;
import com.academiadigital.academiaDigital.model.form.AvaliacaoFisicaForm;
import com.academiadigital.academiaDigital.model.form.AvaliacaoFisicaUpdateForm;

import java.util.List;

public interface IAvaliacaoFisica {

  AvaliacaoFisica create(AvaliacaoFisicaForm form);

  AvaliacaoFisica get(Long id);

  List<AvaliacaoFisica> getAll();

  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate );

  void delete(Long id);

}
