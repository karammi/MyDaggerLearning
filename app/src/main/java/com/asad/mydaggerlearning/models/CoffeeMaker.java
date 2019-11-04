package com.asad.mydaggerlearning.models;

import android.util.Log;

public class CoffeeMaker {
    private Heater heater;
    private Pump pump;

    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew(){
        heater.on();
        pump.pump();
        Log.e("Log", "[_]P coffee! [_]P" );
        heater.off();
    }
}
