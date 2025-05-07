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

    public Inventario() {
    }

    public Inventario(Long inventarioId, String nombreArticulo, String descripcion, Integer cantidad, String unidadMedida, LocalDate fechaUltimaActualizacion, List<MaterialUsado> materialesUsados) {
        this.inventarioId = inventarioId;
        this.nombreArticulo = nombreArticulo;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.unidadMedida = unidadMedida;
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
        this.materialesUsados = materialesUsados;
    }

    public Long getInventarioId() {
        return inventarioId;
    }

    public void setInventarioId(Long inventarioId) {
        this.inventarioId = inventarioId;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public LocalDate getFechaUltimaActualizacion() {
        return fechaUltimaActualizacion;
    }

    public void setFechaUltimaActualizacion(LocalDate fechaUltimaActualizacion) {
        this.fechaUltimaActualizacion = fechaUltimaActualizacion;
    }

    public List<MaterialUsado> getMaterialesUsados() {
        return materialesUsados;
    }

    public void setMaterialesUsados(List<MaterialUsado> materialesUsados) {
        this.materialesUsados = materialesUsados;
    }
}
