package com.example.GestiondeGastos.Controller;

import com.example.GestiondeGastos.Model.Usuarios;
import com.example.GestiondeGastos.Service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuariosService usuariosService;

    @PostMapping
    public Usuarios guardar(@RequestBody Usuarios usuario) {
        return usuariosService.guardar(usuario);
    }

    @GetMapping
    public List<Usuarios> listar() {
        return usuariosService.buscarTodos();
    }

    @GetMapping("/{id}")
    public Usuarios buscarPorId(@PathVariable Long id) {
        return usuariosService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Usuarios actualizar(@PathVariable Long id, @RequestBody Usuarios usuario) {
        return usuariosService.actualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        usuariosService.eliminar(id);
    }
}
