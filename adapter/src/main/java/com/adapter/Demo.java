package com.adapter;

public class Demo {
    public static void main(String[] args) {
        // cria um novo RoundHole de raio 5
        RoundHole hole = new RoundHole(5);
        // cria um novo RoundPeg de raio 5
        RoundPeg rpeg = new RoundPeg(5);

        // verifica se a estaca cabe no buraco
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole 5.");
        }
        // cria uma SquarePeg pequena
        SquarePeg smallSqPeg = new SquarePeg(2);
        // cria uma SquarePeg grande
        SquarePeg largeSqPeg = new SquarePeg(20);

        // cria um adaptador para estacas quadradas pequenas
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        // cria um adaptador para estacas quadradas grandes
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        // verifica se a estaca pequena cabe no buraco, depois das medidas serem
        // adaptadas
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round role r5.");
        }
        // verifica se a estaca grande cabe no buraco, depois das medidas serem
        // adaptadas
        if (hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fits round role r5.");
        }
    }
}
