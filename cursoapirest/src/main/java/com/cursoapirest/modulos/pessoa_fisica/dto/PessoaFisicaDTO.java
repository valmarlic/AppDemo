package com.cursoapirest.modulos.pessoa_fisica.dto;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisicaDTO implements Serializable {

    private static final Long serialVersionUID = 1l;
    private Long id;
    private String nome;
    private String email;

    public PessoaFisicaDTO() {
    }

    public PessoaFisicaDTO(Long id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisicaDTO that)) return false;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

