package com.asad.mydaggerlearning.models;

import android.util.Log;

import javax.inject.Inject;

public class ElectricHeater implements Heater {

    boolean heating;

    @Inject
    public ElectricHeater() {
    }

    @Override
    public void on() {
        Log.e("Log", "~~~ heating ~~~ ");
        this.heating = true;
    }

    @Override
    public void off() {
        Log.e("Log", "~~~ done ~~~");
        this.heating = false;

    }

    @Override
    public boolean isHot() {
        return heating;
    }
}
