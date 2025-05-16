package com.example.Proyecto.Repository;

import com.example.Proyecto.Model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    @Query("SELECT p FROM Pedido p WHERE LOWER(p.estado) = LOWER(:estado)")
    List<Pedido> findByEstado(@Param("estado") String estado);

}
