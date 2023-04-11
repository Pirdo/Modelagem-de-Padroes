package com.factorymethod;

//cria a classe Caminhao implementando a interface Transporte
public class Caminhao implements Transporte{
    @Override
    //utiliza do polimorfismo para alterar o comportamento do metodo
    public void entregar() {
        System.out.println("Entregando por caminhão...");
    }
}
