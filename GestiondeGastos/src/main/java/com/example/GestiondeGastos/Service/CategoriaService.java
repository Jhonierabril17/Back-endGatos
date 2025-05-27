package com.example.GestiondeGastos.Service;

import com.example.GestiondeGastos.Model.Categoria;
import com.example.GestiondeGastos.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria guardar(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> buscarTodos() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public Categoria actualizar(Long id, Categoria categoriaActualizada) {
        Categoria categoria = buscarPorId(id);
        if (categoria != null) {
            categoria.setNombre(categoriaActualizada.getNombre());
            return categoriaRepository.save(categoria);
        }
        return null;
    }

    public void eliminar(Long id) {
        categoriaRepository.deleteById(id);
    }
}
