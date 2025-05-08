package com.example.Proyecto.Service;

import com.example.Proyecto.Model.MaterialUsado;
import com.example.Proyecto.Repository.MaterialUsadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialUsadoService {
    @Autowired
    private MaterialUsadoRepository materialUsadoRepository;

    public List<MaterialUsado> findAll() {
        return materialUsadoRepository.findAll();
    }

    public MaterialUsado save(MaterialUsado materialUsado) {
        return materialUsadoRepository.save(materialUsado);
    }
}
