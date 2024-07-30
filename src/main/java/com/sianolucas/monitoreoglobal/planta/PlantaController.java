package com.sianolucas.monitoreoglobal.planta;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sianolucas.monitoreoglobal.exception.PlantaNotFoundException;

@RestController
@RequestMapping("/api/plantas")
public class PlantaController {

    @Autowired
    private PlantaService plantaService;


    @GetMapping
    public ResponseEntity<List<Planta>> getAllPlantas() {
        List<Planta> plantas = plantaService.getAllPlantas();
        return ResponseEntity.ok(plantas);
    }

    @PostMapping("/register")
    public ResponseEntity<Planta> createPlanta(@RequestBody Planta planta) {
        Planta nuevaPlanta = plantaService.createPlanta(planta);
        return ResponseEntity.ok(nuevaPlanta);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Planta> updatePlanta(@PathVariable Long id, @RequestBody Planta plantaActualizada) {
        Planta planta = plantaService.updatePlanta(id, plantaActualizada);
        return ResponseEntity.ok(planta);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlanta(@PathVariable Long id) {
        plantaService.deletePlanta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planta> getPlantaById(@PathVariable Long id) {
        Optional<Planta> planta = plantaService.getPlantaById(id);
        return planta.map(ResponseEntity::ok)
                .orElseThrow(() -> new PlantaNotFoundException("No existe la planta con ID: " + id));
    }

    @GetMapping("/lecturas")
    public ResponseEntity<List<Planta>> getLecturas() {
        List<Planta> plantas = plantaService.getLecturas();
        return ResponseEntity.ok(plantas);
    }

    @GetMapping("/alertas-medias")
    public ResponseEntity<List<Planta>> getAlertasMedias() {
        List<Planta> plantas = plantaService.getAlertasMedias();
        return ResponseEntity.ok(plantas);
    }

    @GetMapping("/alertas-rojas")
    public ResponseEntity<List<Planta>> getAlertasRojas() {
        List<Planta> plantas = plantaService.getAlertasRojas();
        return ResponseEntity.ok(plantas);
    }

    @GetMapping("/sensores-deshabilitados")
    public ResponseEntity<List<Planta>> getSensoresDeshabilitados() {
        List<Planta> plantas = plantaService.getSensoresDeshabilitados();
        return ResponseEntity.ok(plantas);
    }

    @GetMapping("/plantas-datos")
    public ResponseEntity<List<Planta>> getPlantasYDatos() {
        List<Planta> plantas = plantaService.getPlantasYDatos();
        return ResponseEntity.ok(plantas);
    }

}
