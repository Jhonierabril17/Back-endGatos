package com.example.GestiondeGastos.Controller;

import com.example.GestiondeGastos.Model.Cuenta;
import com.example.GestiondeGastos.Service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cuentas")
public class CuentaController {

    @Autowired
    private CuentaService cuentaService;

    @PostMapping
    public Cuenta guardar(@RequestBody Cuenta cuenta) {
        return cuentaService.guardar(cuenta);
    }

    @GetMapping
    public List<Cuenta> listar() {
        return cuentaService.buscarTodas();
    }

    @GetMapping("/{id}")
    public Cuenta buscarPorId(@PathVariable Long id) {
        return cuentaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Cuenta actualizar(@PathVariable Long id, @RequestBody Cuenta cuenta) {
        return cuentaService.actualizar(id, cuenta);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cuentaService.eliminar(id);
    }
}
