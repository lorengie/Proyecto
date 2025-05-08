package com.example.Proyecto.Controller;

import com.example.Proyecto.Model.Pago;
import com.example.Proyecto.Repository.PagoRepository;
import com.example.Proyecto.Service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pagos")
public class PagoController {
    @Autowired
    private PagoService service;

    @GetMapping public List<Pago> getAll() { return service.findAll(); }
    @PostMapping public Pago create(@RequestBody Pago p) { return service.save(p); }
    @GetMapping("/{id}") public ResponseEntity<Pago> getById(@PathVariable Long id) {
        Pago p = service.findById(id);
        return p != null ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}") public ResponseEntity<Pago> update(@PathVariable Long id, @RequestBody Pago p) {
        if (service.findById(id) == null) return ResponseEntity.notFound().build();
        p.setPagoId(id); return ResponseEntity.ok(service.save(p));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id); return ResponseEntity.noContent().build();
    }
}
