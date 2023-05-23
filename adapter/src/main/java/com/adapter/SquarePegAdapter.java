package com.adapter;

public class SquarePegAdapter extends RoundPeg {
    // define o adaptador da estaca quadrada
    private SquarePeg peg;

    // construtor do adaptador
    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // converte a área do do quadrado para raio
    @Override
    public double getRadius() {
        return Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2);
    }
}
