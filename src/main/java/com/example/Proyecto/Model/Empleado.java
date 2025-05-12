package com.example.Proyecto.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "empleados")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empleadoId;

    private String nombre;
    private String rol;
    private String telefono;

    @Column(name = "fecha_ingreso")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate fecha_ingreso;

    @OneToMany(mappedBy = "empleado")
    @JsonManagedReference
    private List<Pedido> pedidos;

    public Empleado() {
    }

    public Empleado(Long empleadoId, String nombre, String rol, String telefono, LocalDate fechaIngreso, List<Pedido> pedidos) {
        this.empleadoId = empleadoId;
        this.nombre = nombre;
        this.rol = rol;
        this.telefono = telefono;
        this.fecha_ingreso = fecha_ingreso;
        this.pedidos = pedidos;
    }

    public Long getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(Long empleadoId) {
        this.empleadoId = empleadoId;
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

    public LocalDate getfecha_ingreso() {
        return fecha_ingreso;
    }

    public void setfecha_ingreso(LocalDate fechaIngreso) {
        this.fecha_ingreso = fechaIngreso;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
