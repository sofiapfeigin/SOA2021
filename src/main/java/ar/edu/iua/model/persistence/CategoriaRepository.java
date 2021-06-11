package ar.edu.iua.model.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.iua.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
