package com.example.GestiondeGastos.Repository;

import com.example.GestiondeGastos.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
