package com.example.GestiondeGastos.Repository;

import com.example.GestiondeGastos.Model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
}
