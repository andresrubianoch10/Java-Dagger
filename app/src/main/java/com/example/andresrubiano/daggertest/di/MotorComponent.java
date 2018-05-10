package com.example.andresrubiano.daggertest.di;

import com.example.andresrubiano.daggertest.MainActivity;

import dagger.Component;

/**
 * Created by andres.rubiano on 6/05/2018.
 */

@PerActivity
@Component(modules={MotorModule.class})
public interface MotorComponent {

    void inject(MainActivity activity);
}
