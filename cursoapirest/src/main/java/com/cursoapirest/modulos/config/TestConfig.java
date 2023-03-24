package com.cursoapirest.modulos.config;

import com.cursoapirest.modulos.pessoa_fisica.model.PessoaFisica;
import com.cursoapirest.modulos.pessoa_fisica.repositorio.PessoaFisicaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
    @Autowired
    public PessoaFisicaRepositorio pessoaFisicaRepositorio;
    @Override
    public void run(String... args)throws Exception{
        PessoaFisica pessoaFisica1 = new PessoaFisica(null,"Maria da Silva","mariadasilva@gmail.com",
                "966.986.450-01");
        PessoaFisica pessoaFisica2 = new PessoaFisica(null,"João da Silva","joaodailva@gmail.com",
                "366.586.451-01");
        pessoaFisicaRepositorio.saveAll(Arrays.asList(pessoaFisica1,pessoaFisica2));
    }
}
