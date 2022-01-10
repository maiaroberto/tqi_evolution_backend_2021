package com.maiaroberto.tqi_evolution_backend_2021.clientes.resources;

import com.maiaroberto.tqi_evolution_backend_2021.clientes.entities.Cliente;
import com.maiaroberto.tqi_evolution_backend_2021.clientes.repositories.ClienteRepository;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    private ClienteRepository repository;

    public ClienteResource(ClienteRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public java.util.List<Cliente> cliente() { return repository.findAll();}

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOne(@PathVariable Long id) {
            Optional<Cliente> optional = repository.findById(id);

            if (optional.isPresent()) {
                return ResponseEntity.ok().body(optional.get());
            } else{
                return ResponseEntity.notFound().build();
            }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deletePost(@PathVariable Long id) {

        repository.deleteById(id);

        return ResponseEntity.ok().build();

    }

    

}
