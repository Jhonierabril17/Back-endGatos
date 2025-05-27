package com.example.GestiondeGastos.Repository;

import com.example.GestiondeGastos.Model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GastoRepository extends JpaRepository<Gasto, Long> {
}
