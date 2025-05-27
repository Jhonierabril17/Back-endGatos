package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Transaccion;
import com.example.GestiondeGastos.Repository.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    public Transaccion guardar(Transaccion transaccion) {
        return transaccionRepository.save(transaccion);
    }

    public List<Transaccion> buscarTodos() {
        return transaccionRepository.findAll();
    }

    public List<Transaccion> buscarPorUsuario(Long usuarioId) {
        return transaccionRepository.findByUsuarioId(usuarioId);
    }

    public Transaccion buscarPorId(Long id) {
        return transaccionRepository.findById(id).orElse(null);
    }

    public Transaccion actualizar(Long id, Transaccion transaccion) {
        transaccion.setId(id);
        return transaccionRepository.save(transaccion);
    }

    public void eliminar(Long id) {
        transaccionRepository.deleteById(id);
    }
}

