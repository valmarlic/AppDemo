package com.cursoapirest.modulos.pessoa_fisica.model;

import java.io.Serializable;
import java.util.Objects;

public class PessoaFisica implements Serializable {

    private static final Long serialVersionUID = 1l;
    private Long id;
    private String nome;
    private String email;
    private String cpf;


    public PessoaFisica() {
    }

    public PessoaFisica(Long id, String nome, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisica that)) return false;
        return Objects.equals(id, that.id);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

