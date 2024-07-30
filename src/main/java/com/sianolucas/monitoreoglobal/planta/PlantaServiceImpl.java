package com.sianolucas.monitoreoglobal.planta;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sianolucas.monitoreoglobal.exception.PlantaNotFoundException;

@Service
public class PlantaServiceImpl implements PlantaService {

    @Autowired
    private PlantaRepository plantaRepository;

    @Override
    public Planta createPlanta(Planta planta) {
        return plantaRepository.save(planta);
    }

    @Override
    public Optional<Planta> getPlantaById(Long id) {
        return plantaRepository.findById(id);
    }

    @Override
    public List<Planta> getAllPlantas() {
        return plantaRepository.findAll();
    }

    @Override
    public Planta updatePlanta(Long id, Planta plantaActualizada) {

        if (plantaRepository.existsById(id)) {
            plantaActualizada.setId(id);
            return plantaRepository.save(plantaActualizada);
        } else {
            throw new PlantaNotFoundException("No existe la planta con ID:" + id);
        }
    }

    @Override
    public void deletePlanta(Long id) {
        if (plantaRepository.existsById(id)) {

            plantaRepository.deleteById(id);

        } else {
            throw new PlantaNotFoundException("No existe la planta con ID:" + id);
        }

    }

    @Override
    public List<Planta> getLecturas() {
        return plantaRepository.findAll();
    }

    @Override
    public List<Planta> getAlertasMedias() {

        return plantaRepository.findByAlertasMediasGreaterThan(0);
    }

    @Override
    public List<Planta> getAlertasRojas() {
        return plantaRepository.findByAlertasRojasGreaterThan(0);
    }

    @Override
    public List<Planta> getSensoresDeshabilitados() {
        // Obtiene plantas con lecturas nulas (Si es que esto indica sensores  (deshabilitados)
        return plantaRepository.findByLecturasIsNull();
    }

    @Override
    public List<Planta> getPlantasYDatos() {
        // Obtener todas las plantas con todos sus datos
        return plantaRepository.findAll();
    }

    @Override
    public Integer getLecturasById(Long id) {
        return plantaRepository.findById(id)
                .map(Planta::getLecturas)
                .orElseThrow(() -> new PlantaNotFoundException("No existe la planta con ID: " + id));
    }

    @Override
    public Integer getAlertasMediasById(Long id) {
        return plantaRepository.findById(id)
                .map(Planta::getAlertasMedias)
                .orElseThrow(() -> new PlantaNotFoundException("No existe la planta con ID: " + id));
    }

    @Override
    public Integer getAlertasRojasById(Long id) {
        return plantaRepository.findById(id)
                .map(Planta::getAlertasRojas)
                .orElseThrow(() -> new PlantaNotFoundException("No existe la planta con ID: " + id));
    }

}
