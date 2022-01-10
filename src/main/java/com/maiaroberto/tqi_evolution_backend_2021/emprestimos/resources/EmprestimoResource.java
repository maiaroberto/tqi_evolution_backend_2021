package com.maiaroberto.tqi_evolution_backend_2021.emprestimos.resources;

import com.maiaroberto.tqi_evolution_backend_2021.emprestimos.entities.Emprestimo;
import com.maiaroberto.tqi_evolution_backend_2021.emprestimos.repositories.EmprestimoRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/emprestimo")
public class EmprestimoResource {

    private EmprestimoRepository repository;

    public EmprestimoResource(EmprestimoRepository repository) {
        this.repository = repository;
    }

    // pesquisar todos de um cliente
    // pesquisar um especifico

    @GetMapping
    public java.util.List<Emprestimo> emprestimos() {
        return repository.findAll();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Long id) {
        Optional<Emprestimo> optional = repository.findById(id);

        if (optional.isPresent()) {
            return ResponseEntity.ok().body(optional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
