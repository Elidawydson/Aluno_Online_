package br.com.alunoonline.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alunoonline.api.model.Professor;


@Repository // Define a interface como um Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long>{

}