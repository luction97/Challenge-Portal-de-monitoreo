package com.sianolucas.monitoreoglobal.planta;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantaRepository extends JpaRepository<Planta, Long>  {

    List<Planta> findByAlertasMediasGreaterThan(Integer valor);

    List<Planta> findByAlertasRojasGreaterThan(Integer valor);

    List<Planta> findByLecturasIsNull();

}
