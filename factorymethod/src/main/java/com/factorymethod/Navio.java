package com.factorymethod;

//cria a classe Navio implementando a interface Transporte
public class Navio implements Transporte {
    //utiliza do polimorfismo para alterar o comportamento do metodo
    public void entregar() {
        System.out.println("Entregando por navio...");
    }
}
