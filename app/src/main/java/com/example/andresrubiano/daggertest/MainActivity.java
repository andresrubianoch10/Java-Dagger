package com.example.andresrubiano.daggertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.andresrubiano.daggertest.di.MotorApplication;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

public class MainActivity extends AppCompatActivity {

    @Named("diesel")
    @Inject
    Motor motor;

    @Inject
    Coche coche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MotorApplication) getApplication()).getMotorComponent().inject(this);
        Toast.makeText(this, motor.getTipoMotor(), Toast.LENGTH_SHORT).show();

        Toast.makeText(this, coche.getMotor(), Toast.LENGTH_SHORT).show();
    }
}
