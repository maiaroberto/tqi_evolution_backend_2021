package com.maiaroberto.tqi_evolution_backend_2021.senhas.resources;

import com.maiaroberto.tqi_evolution_backend_2021.senhas.entities.Senha;
import com.maiaroberto.tqi_evolution_backend_2021.senhas.repositories.SenhaReository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/senhas")
public class SenhaResource {


    private SenhaReository repository;

    public SenhaResource(SenhaReository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Senha> senhas() {
        return repository.findAll();
    }
}
