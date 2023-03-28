package com.builder.manual;

import com.builder.builder.Builder;

public class ManualBuilder implements Builder{
    private Manual manual = new Manual();

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int numero) {
        System.out.println("O manual irá orientar que o número de bancos é: "+numero);
    }

    @Override
    public void setEngine(String motor) {
        System.out.println("O manual irá orientar que o tipo do motor é: "+motor);
    }

    @Override
    public void setTripComputer() {
        System.out.println("O manual irá orientar como configurar o Trip Computer ");
    }

    @Override
    public void setGPS() {
        System.out.println("O manual irá orientar como configurar o GPS ");
    }

    public Manual getResult() {
        return this.manual;
    };
}
