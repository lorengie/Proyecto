package com.example.Proyecto.Controller;

import com.example.Proyecto.Model.DetallePedido;
import com.example.Proyecto.Repository.DetallePedidoRepository;
import com.example.Proyecto.Service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detallepedido")
public class DetallePedidoController {
    @Autowired
    private DetallePedidoService service;

    @GetMapping public List<DetallePedido> getAll() { return service.findAll(); }
    @PostMapping public DetallePedido create(@RequestBody DetallePedido d) { return service.save(d); }
    @GetMapping("/{id}") public ResponseEntity<DetallePedido> getById(@PathVariable Long id) {
        DetallePedido d = service.findById(id);
        return d != null ? ResponseEntity.ok(d) : ResponseEntity.notFound().build();
    }
    @PutMapping("/{id}") public ResponseEntity<DetallePedido> update(@PathVariable Long id, @RequestBody DetallePedido d) {
        if (service.findById(id) == null) return ResponseEntity.notFound().build();
        d.setDetalleId(id); return ResponseEntity.ok(service.save(d));
    }
    @DeleteMapping("/{id}") public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id); return ResponseEntity.noContent().build();
    }
}
