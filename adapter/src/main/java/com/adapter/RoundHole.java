package com.adapter;

public class RoundHole {
    // define o raio do buraco
    private double radius;

    // construtor do buraco
    public RoundHole(double radius) {
        this.radius = radius;
    }

    /**
     * @return double return the radius
     */
    // pega o raio do buraco
    public double getRadius() {
        return radius;
    }

    // verifica se a estaca cabe no buraco
    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}
