package com.sianolucas.monitoreoglobal.planta;

import com.sianolucas.monitoreoglobal.pais.Pais;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "planta")
public class Planta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Pais pais;

    @NotNull
    private String nombrePlanta;

    private Integer lecturas = 0;
    private Integer alertasMedias = 0;
    private Integer alertasRojas = 0;

}
