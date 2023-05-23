package com.adapter;

public class RoundPeg {
    // define o raio da estaca
    private double radius;

    public RoundPeg() {
    }

    // construtor da estaca
    public RoundPeg(double radius) {
        this.radius = radius;
    }

    /**
     * @return double return the radius
     */
    // pega o raio da estaca
    public double getRadius() {
        return radius;
    }

}
