package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Usuarios;
import com.example.GestiondeGastos.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosService {

    @Autowired
    private UsuarioRepository usuariosRepository;

    public Usuarios guardar(Usuarios usuario) {
        return usuariosRepository.save(usuario);
    }

    public List<Usuarios> buscarTodos() {
        return usuariosRepository.findAll();
    }

    public Usuarios buscarPorId(Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    public Usuarios actualizar(Long id, Usuarios usuarioActualizado) {
        Usuarios usuario = buscarPorId(id);
        if (usuario != null) {
            usuario.setNombre(usuarioActualizado.getNombre());
            usuario.setCorreo(usuarioActualizado.getCorreo());
            usuario.setContrasena(usuarioActualizado.getContrasena());
            return usuariosRepository.save(usuario);
        }
        return null;
    }

    public void eliminar(Long id) {
        usuariosRepository.deleteById(id);
    }
}
