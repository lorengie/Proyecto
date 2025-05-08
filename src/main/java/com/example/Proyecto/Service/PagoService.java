package com.example.Proyecto.Service;

import com.example.Proyecto.Model.Pago;
import com.example.Proyecto.Repository.PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class PagoService {
    @Autowired
    private PagoRepository pagoRepository;

    public List<Pago> findAll() {
        return pagoRepository.findAll();
    }

    public Pago save(Pago pago) {
        return pagoRepository.save(pago);
    }
}
