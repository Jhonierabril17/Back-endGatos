package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Cuenta;
import com.example.GestiondeGastos.Repository.CuentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    public Cuenta guardar(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    public List<Cuenta> buscarTodas() {
        return cuentaRepository.findAll();
    }

    public Cuenta buscarPorId(Long id) {
        return cuentaRepository.findById(id).orElse(null);
    }

    public Cuenta actualizar(Long id, Cuenta cuentaActualizada) {
        Cuenta cuenta = buscarPorId(id);
        if (cuenta != null) {
            cuenta.setNombre(cuentaActualizada.getNombre());
            cuenta.setTipo(cuentaActualizada.getTipo());
            cuenta.setSaldo_Inicial(cuentaActualizada.getSaldo_Inicial());
            cuenta.setUsuario(cuentaActualizada.getUsuario());
            return cuentaRepository.save(cuenta);
        }
        return null;
    }

    public void eliminar(Long id) {
        cuentaRepository.deleteById(id);
    }
}
