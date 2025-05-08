package com.example.Proyecto.Service;

import com.example.Proyecto.Model.DetallePedido;
import com.example.Proyecto.Repository.DetallePedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoService {
    @Autowired
    private DetallePedidoRepository repo;

    public List<DetallePedido> findAll() { return repo.findAll(); }
    public DetallePedido save(DetallePedido d) { return repo.save(d); }
    public DetallePedido findById(Long id) { return repo.findById(id).orElse(null); }
    public void delete(Long id) { repo.deleteById(id); }
}
