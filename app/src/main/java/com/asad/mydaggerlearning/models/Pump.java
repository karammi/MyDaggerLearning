package com.asad.mydaggerlearning.models;

import android.util.Log;

import javax.inject.Inject;

public class Pump {

    @Inject
    public Pump() {
    }

    public void pump(){
        Log.e("Log", "=> => pumping => => " );
    }
}
