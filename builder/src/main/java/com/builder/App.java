package com.builder;

import com.builder.car.CarBuilder;
import com.builder.director.Director;
import com.builder.manual.ManualBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Director director = new Director();
        CarBuilder carBuilder = new CarBuilder();
        ManualBuilder manualBuilder = new ManualBuilder();
        director.makeSUV(carBuilder);
        director.makeSUV(manualBuilder);
        director.makeSportCar(carBuilder);
        director.makeSportCar(manualBuilder);
        carBuilder.getResult();
        manualBuilder.getResult();
    }
}
