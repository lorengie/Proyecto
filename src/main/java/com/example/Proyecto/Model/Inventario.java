package com.example.Proyecto.Model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "inventario")
public class Inventario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventarioId;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    private String descripcion;
    private Integer cantidad;

    @Column(name = "unidad_medida")
    private String unidadMedida;

    @Column(name = "fecha_ultima_actualizacion")
    private LocalDate fechaUltimaActualizacion;

    @OneToMany(mappedBy = "inventario")
    private List<MaterialUsado> materialesUsados;
}
