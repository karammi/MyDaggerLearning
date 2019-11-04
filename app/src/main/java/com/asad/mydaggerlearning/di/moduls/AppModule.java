package com.asad.mydaggerlearning.di.moduls;

import com.asad.mydaggerlearning.models.CoffeeMaker;
import com.asad.mydaggerlearning.models.ElectricHeater;
import com.asad.mydaggerlearning.models.Heater;
import com.asad.mydaggerlearning.models.Pump;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {

    @Provides
    public static CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);
    }

//    @Provides
//    public static Heater provideHeater(ElectricHeater electricHeater) {
//        return electricHeater;
//    }


    @Binds
    abstract Heater bindsHeater(ElectricHeater electricHeater);


}
