package com.example.GestiondeGastos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Cuenta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private Double saldo_Inicial;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;
}
