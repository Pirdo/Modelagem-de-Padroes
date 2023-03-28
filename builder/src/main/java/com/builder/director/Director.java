package com.builder.director;

import com.builder.builder.Builder;

public class Director {
        
    public void makeSUV(Builder builder) {
        builder.reset();
        builder.setSeats(5);
        builder.setEngine("v6");
        builder.setTripComputer();
        builder.setGPS();
    }

    public void makeSportCar(Builder builder) {
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("v8");
        builder.setTripComputer();
        builder.setGPS();
    }
}
