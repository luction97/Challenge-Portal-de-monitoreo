package com.sianolucas.monitoreoglobal.planta;

import java.util.List;
import java.util.Optional;

public interface PlantaService {

    public Planta createPlanta(Planta planta);

    public Optional<Planta> getPlantaById(Long id);

    public List<Planta> getAllPlantas();

    public Planta updatePlanta(Long id, Planta plantaActualizada);

    public void deletePlanta(Long id);

    public List<Planta> getLecturas();

    public List<Planta> getAlertasMedias();

    public List<Planta> getAlertasRojas();

    public List<Planta> getSensoresDeshabilitados();

    public List<Planta> getPlantasYDatos();

    public Integer getLecturasById(Long id);

    public Integer getAlertasMediasById(Long id);

    public Integer getAlertasRojasById(Long id);

    
}
