package com.builder.car;

import com.builder.builder.Builder;

public class CarBuilder implements Builder{
    private Car car = new Car();

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int numero) {
       System.out.println("O número de assentos agora é: "+numero);
    }

    @Override
    public void setEngine(String motor) {
        System.out.println("O tipo de motor agora é um: "+motor);
    }

    @Override
    public void setTripComputer() {
        System.out.println("O Trip Computer foi adicionado e configurado");
    }

    @Override
    public void setGPS() {
        System.out.println("O GPS foi adicionado e configurado");
    }

    public Car getResult() {
        return this.car;
    };
}
