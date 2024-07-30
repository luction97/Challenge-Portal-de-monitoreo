package com.sianolucas.monitoreoglobal.pais;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/paises")
public class PaisController {

    @GetMapping
    public List<String> getPaises() { // Devuelve la lista de paises recopilando los nombres en una lista de cadenas.
        return Arrays.stream(Pais.values())
                .map(pais -> pais.getNombrePais())
                .collect(Collectors.toList());
    }

}
