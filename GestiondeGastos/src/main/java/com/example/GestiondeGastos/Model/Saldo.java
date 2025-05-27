package com.example.GestiondeGastos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Saldo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Saldo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double monto;

    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "cuenta_id")
    private Cuenta cuenta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuarios usuario;
}
