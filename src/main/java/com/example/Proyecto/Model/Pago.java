package com.example.Proyecto.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagoId;

    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    private Double monto;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "forma_pago")
    private String formaPago;

    @Column(name = "nombre_persona_que_pago")
    private String nombrePersonaQuePago;
}
