package com.example.Proyecto.Service;

import com.example.Proyecto.Model.Inventario;
import com.example.Proyecto.Repository.InventarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventarioService {
    @Autowired
    private InventarioRepository inventarioRepository;

    public List<Inventario> findAll() {
        return inventarioRepository.findAll();
    }

    public Inventario save(Inventario inventario) {
        return inventarioRepository.save(inventario);
    }
}
