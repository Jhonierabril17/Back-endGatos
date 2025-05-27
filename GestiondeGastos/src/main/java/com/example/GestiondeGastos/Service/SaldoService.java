package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Saldo;
import com.example.GestiondeGastos.Repository.SaldoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaldoService {

    @Autowired
    private SaldoRepository saldoRepository;

    public Saldo guardar(Saldo saldo) {
        return saldoRepository.save(saldo);
    }

    public List<Saldo> buscarTodos() {
        return saldoRepository.findAll();
    }

    public Saldo buscarPorId(Long id) {
        return saldoRepository.findById(id).orElse(null);
    }

    public Saldo actualizar(Long id, Saldo saldoActualizado) {
        Saldo saldo = buscarPorId(id);
        if (saldo != null) {
            saldo.setMonto(saldoActualizado.getMonto());
            saldo.setFecha(saldoActualizado.getFecha());
            saldo.setCuenta(saldoActualizado.getCuenta());
            return saldoRepository.save(saldo);
        }
        return null;
    }

    public void eliminar(Long id) {
        saldoRepository.deleteById(id);
    }
}
