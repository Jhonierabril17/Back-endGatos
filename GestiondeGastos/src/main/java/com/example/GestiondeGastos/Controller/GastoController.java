package com.example.GestiondeGastos.Controller;

import com.example.GestiondeGastos.Model.Gasto;
import com.example.GestiondeGastos.Service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gastos")
public class GastoController {

    @Autowired
    private GastoService gastoService;

    @PostMapping
    public Gasto guardar(@RequestBody Gasto gasto) {
        return gastoService.guardar(gasto);
    }

    @GetMapping
    public List<Gasto> listar() {
        return gastoService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Gasto buscarPorId(@PathVariable Long id) {
        return gastoService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Gasto actualizar(@PathVariable Long id, @RequestBody Gasto gasto) {
        return gastoService.actualizar(id, gasto);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        gastoService.eliminar(id);
    }
}
