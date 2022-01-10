package com.maiaroberto.tqi_evolution_backend_2021.emprestimos.repositories;

import com.maiaroberto.tqi_evolution_backend_2021.emprestimos.entities.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository <Emprestimo, Long> {

}
