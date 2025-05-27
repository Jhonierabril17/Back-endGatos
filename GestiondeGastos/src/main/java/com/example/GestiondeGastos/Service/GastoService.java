package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Gasto;
import com.example.GestiondeGastos.Repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GastoService {

    @Autowired
    private GastoRepository gastoRepository;

    public Gasto guardar(Gasto gasto) {
        return gastoRepository.save(gasto);
    }

    public List<Gasto> buscarTodos() {
        return gastoRepository.findAll();
    }

    public Gasto buscarPorId(Long id) {
        return gastoRepository.findById(id).orElse(null);
    }

    public Gasto actualizar(Long id, Gasto gastoActualizado) {
        Gasto gasto = buscarPorId(id);
        if (gasto != null) {
            gasto.setDescripcion(gastoActualizado.getDescripcion());
            gasto.setMonto(gastoActualizado.getMonto());
            gasto.setFecha(gastoActualizado.getFecha());
            gasto.setUsuario(gastoActualizado.getUsuario());
            gasto.setCategoria(gastoActualizado.getCategoria());
            return gastoRepository.save(gasto);
        }
        return null;
    }

    public void eliminar(Long id) {
        gastoRepository.deleteById(id);
    }
}
