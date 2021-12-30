package com.maiaroberto.tqi_evolution_backend_2021.senhas.repositories;

import com.maiaroberto.tqi_evolution_backend_2021.senhas.entities.Senha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SenhaReository extends JpaRepository <Senha, Long> {

}
