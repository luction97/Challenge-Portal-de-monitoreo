package com.sianolucas.monitoreoglobal.pais;

public enum Pais {

    ARGENTINA("Argentina"),
    BOLIVIA("Bolivia"),
    BRASIL("Brasil"),
    CHILE("Chile"),
    COLOMBIA("Colombia"),
    COSTA_RICA("Costa Rica"),
    CUBA("Cuba"),
    REPUBLICA_DOMINICANA("República Dominicana"),
    ECUADOR("Ecuador"),
    EL_SALVADOR("El Salvador"),
    GUATEMALA("Guatemala"),
    HONDURAS("Honduras"),
    MEXICO("México"),
    NICARAGUA("Nicaragua"),
    PANAMA("Panamá"),
    PARAGUAY("Paraguay"),
    PERU("Perú"),
    PUERTO_RICO("Puerto Rico"),
    URUGUAY("Uruguay"),
    VENEZUELA("Venezuela");

    private final String nombrePais;

    Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }
}
