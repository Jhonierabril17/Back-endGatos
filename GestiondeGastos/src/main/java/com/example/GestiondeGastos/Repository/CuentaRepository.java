package com.example.GestiondeGastos.Repository;

import com.example.GestiondeGastos.Model.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<Cuenta, Long> {
}
