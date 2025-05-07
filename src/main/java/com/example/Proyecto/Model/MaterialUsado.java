package com.example.Proyecto.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "materiales_usados")
public class MaterialUsado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usoId;

    @ManyToOne
    @JoinColumn(name = "detalle_id")
    private DetallePedido detallePedido;

    @ManyToOne
    @JoinColumn(name = "inventario_id")
    private Inventario inventario;

    @Column(name = "cantidad_usada")
    private Integer cantidadUsada;
}
