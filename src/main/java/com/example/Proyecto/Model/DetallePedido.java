package com.example.Proyecto.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "detalle_pedido")
public class DetallePedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;

    @ManyToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    private String prenda;
    private String descripcion;
    private Integer cantidad;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    private Double subtotal;

    @OneToMany(mappedBy = "detallePedido")
    private List<MaterialUsado> materialesUsados;
}
