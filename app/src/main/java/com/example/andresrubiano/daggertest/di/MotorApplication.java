package com.example.andresrubiano.daggertest.di;

import android.app.Application;

/**
 * Created by andres.rubiano on 6/05/2018.
 */

public class MotorApplication extends Application {
    private MotorComponent motorComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        motorComponent = DaggerMotorComponent.builder()
                .motorModule(new MotorModule())
                .build();
    }

    public MotorComponent getMotorComponent() {
        return motorComponent;
    }
}
