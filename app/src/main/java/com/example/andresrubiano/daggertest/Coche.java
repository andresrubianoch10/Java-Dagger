package com.example.andresrubiano.daggertest;

/**
 * Created by andres.rubiano on 6/05/2018.
 */

public class Coche {

    private Motor motor;

    public Coche(Motor motor) {
        this.motor = motor;
    }

    public String getMotor() {
        return "Coche con " + motor.getTipoMotor();
    }
}
