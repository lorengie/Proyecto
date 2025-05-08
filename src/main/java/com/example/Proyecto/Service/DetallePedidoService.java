package com.example.Proyecto.Service;

import com.example.Proyecto.Model.DetallePedido;
import com.example.Proyecto.Repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {
    @Autowired
    private DetallePedidoRepository detallePedidoRepository;

    public List<DetallePedido> findAll() {
        return detallePedidoRepository.findAll();
    }

    public DetallePedido save(DetallePedido detallePedido) {
        return detallePedidoRepository.save(detallePedido);
    }
}
