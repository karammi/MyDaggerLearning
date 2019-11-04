package com.asad.mydaggerlearning.di.component;

import com.asad.mydaggerlearning.MainActivity;
import com.asad.mydaggerlearning.di.moduls.AppModule;

import dagger.Component;

@Component(modules = {AppModule.class})
public abstract class AppComponent {

    abstract public void inject(MainActivity mainActivity);
}
