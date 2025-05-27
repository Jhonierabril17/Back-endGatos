package com.example.GestiondeGastos.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "Transaccion")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaccion {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private Double monto;
        private LocalDate fecha;
        private String tipo;

        @ManyToOne
        @JoinColumn(name = "usuario_id")
        private Usuarios usuario;

}