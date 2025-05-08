package com.example.Proyecto.Service;

import com.example.Proyecto.Model.Pedido;
import com.example.Proyecto.Repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository repo;

    public List<Pedido> findAll() { return repo.findAll(); }
    public Pedido save(Pedido p) { return repo.save(p); }
    public Pedido findById(Long id) { return repo.findById(id).orElse(null); }
    public void delete(Long id) { repo.deleteById(id); }
}
