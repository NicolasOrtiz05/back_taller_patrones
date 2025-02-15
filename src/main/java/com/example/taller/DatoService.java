package com.example.taller;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DatoService {
    private final DatoRepository datoRepository;

    public DatoService(DatoRepository datoRepository) {
        this.datoRepository = datoRepository;
    }

    public List<Dato> obtenerTodos() {
        return datoRepository.findAll();
    }

    public Dato guardar(Dato dato) {
        return datoRepository.save(dato);
    }

    public void eliminar(Long id) {
        datoRepository.deleteById(id);
    }
}
