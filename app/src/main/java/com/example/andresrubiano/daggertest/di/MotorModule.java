package com.example.andresrubiano.daggertest.di;

import com.example.andresrubiano.daggertest.Coche;
import com.example.andresrubiano.daggertest.Motor;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by andres.rubiano on 6/05/2018.
 */

@Module
public class MotorModule {

    @PerActivity
    @Named("diesel")
    @Provides
    public Motor providesMotorDiesel() {
        return new Motor("diesel");
    }

    @PerActivity
    @Named("gasolina")
    @Provides
    public Motor providesMotorGasolina() {
        return new Motor("gasolina");
    }

    @Provides
    public Coche providesCoche(@Named("gasolina") Motor motor) {
        return new Coche(motor);
    }
}
