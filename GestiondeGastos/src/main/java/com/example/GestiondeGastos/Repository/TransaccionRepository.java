package com.example.GestiondeGastos.Repository;

import com.example.GestiondeGastos.Model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    List<Transaccion> findByUsuarioId(Long usuarioId);
}