package com.example.GestiondeGastos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "Categoria")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Categoria {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;

        @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
        private List<Gasto> gastos;


}
