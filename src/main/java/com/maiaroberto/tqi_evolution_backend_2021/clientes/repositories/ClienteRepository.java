package com.maiaroberto.tqi_evolution_backend_2021.clientes.repositories;

import com.maiaroberto.tqi_evolution_backend_2021.clientes.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Long> {
}
