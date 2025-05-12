package com.example.Proyecto.Model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pagoId;
    @ManyToOne
    @JsonBackReference

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

    public Pago() {
    }

    public Pago(Long pagoId, Pedido pedido, Double monto, LocalDate fechaPago, String formaPago, String nombrePersonaQuePago) {
        this.pagoId = pagoId;
        this.pedido = pedido;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
        this.nombrePersonaQuePago = nombrePersonaQuePago;
    }

    public Long getPagoId() {
        return pagoId;
    }

    public void setPagoId(Long pagoId) {
        this.pagoId = pagoId;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public String getNombrePersonaQuePago() {
        return nombrePersonaQuePago;
    }

    public void setNombrePersonaQuePago(String nombrePersonaQuePago) {
        this.nombrePersonaQuePago = nombrePersonaQuePago;
    }
}
