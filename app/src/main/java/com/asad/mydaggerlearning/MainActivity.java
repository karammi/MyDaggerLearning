package com.asad.mydaggerlearning;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.asad.mydaggerlearning.di.component.AppComponent;
import com.asad.mydaggerlearning.di.component.DaggerAppComponent;
import com.asad.mydaggerlearning.models.CoffeeMaker;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    AppComponent appComponent;

    @Inject
    CoffeeMaker coffeeMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        appComponent  = DaggerAppComponent.builder()
                .build();

        appComponent.inject(this);

        coffeeMaker.brew();
    }
}
