package com.example.GestiondeGastos.Controller;

import com.example.GestiondeGastos.Model.Saldo;
import com.example.GestiondeGastos.Service.SaldoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/saldos")
public class SaldoController {

    @Autowired
    private SaldoService saldoService;

    @PostMapping
    public Saldo guardar(@RequestBody Saldo saldo) {
        return saldoService.guardar(saldo);
    }

    @GetMapping
    public List<Saldo> listar() {
        return saldoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Saldo buscarPorId(@PathVariable Long id) {
        return saldoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Saldo actualizar(@PathVariable Long id, @RequestBody Saldo saldo) {
        return saldoService.actualizar(id, saldo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        saldoService.eliminar(id);
    }
}
