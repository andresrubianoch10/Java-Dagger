package com.example.andresrubiano.daggertest;

/**
 * Created by andres.rubiano on 6/05/2018.
 */

public class Motor {
    private String tipoMotor;

    public Motor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public String getTipoMotor() {
        return "Motor: " + tipoMotor;
    }
}
