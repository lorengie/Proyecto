package com.example.Proyecto.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {
    @JsonProperty("empleado_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleadoId;

    private String nombre;
    private String rol;
    private String telefono;

    @JsonProperty("fecha_ingreso")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaIngreso;

    @OneToMany(mappedBy = "empleado")
    @JsonManagedReference(value = "empleado-pedidos")
    private List<Pedido> pedidos;

    public Empleado() {
    }

    public Empleado(Long empleadoId, String nombre, String rol, String telefono, LocalDate fechaIngreso, List<Pedido> pedidos) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.rol = rol;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
        this.pedidos = pedidos;
    }

    public Long getempleadoId() {
        return empleadoId;
    }

    public void setempleadoId(Long empleadoId) {
        this.empleadoId = this.empleadoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getfechaIngreso() {
        return fechaIngreso;
    }

    public void setfechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso  = fechaIngreso;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
