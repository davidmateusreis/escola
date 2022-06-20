package com.david.escola.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.david.escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    
}
