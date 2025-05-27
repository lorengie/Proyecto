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
    private String metodo;

    private Double monto;

    @Column(name = "fecha_pago")
    private LocalDate fechaPago;

    @Column(name = "forma_pago")
    private String formaPago;



    public Pago() {
    }

    public Pago(Long pagoId, Pedido pedido, String metodo, Double monto, LocalDate fechaPago, String formaPago) {
        this.pagoId = pagoId;
        this.pedido = pedido;
        this.metodo = metodo;
        this.monto = monto;
        this.fechaPago = fechaPago;
        this.formaPago = formaPago;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
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


}
