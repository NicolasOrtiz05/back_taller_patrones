package com.example.taller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*") // Permitir peticiones desde cualquier frontend
@RestController
@RequestMapping("/api/datos")
public class DatoController {
    private final DatoService datoService;

    public DatoController(DatoService datoService) {
        this.datoService = datoService;
    }

    @GetMapping
    public List<Dato> obtenerTodos() {
        return datoService.obtenerTodos();
    }
//Prueba para ver si el pipeline funciona
    @PostMapping
    public Dato guardar(@RequestBody Dato dato) {
        return datoService.guardar(dato);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        datoService.eliminar(id);
    }
}
