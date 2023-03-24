package com.cursoapirest.modulos.pessoa_fisica.rest;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.status.dto.StatusDTO;
import org.springframework.http.ResponseEntity;

public interface PessoaFisicaApi {
    ResponseEntity<PessoaFisica> getStatus();
}
