package com.adapter;

public class SquarePeg {
    // define a largura da estaca
    private double width;

    // construtor da estaca
    public SquarePeg(double width) {
        this.width = width;
    }

    /**
     * @return double return the width
     */
    // pega a largura da estaca
    public double getWidth() {
        return width;
    }

    // pega a área do quadrado
    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
