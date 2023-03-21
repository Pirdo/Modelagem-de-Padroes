package com.shopsimulator.button;

//cria a classe WindowsButton que implementa a interface Button, ou seja, seus métodos
public class WindowsButton implements Button{
    //cria o metodo paint para colocar os elementos na tela
    public void paint() {
        //adiciona a implementação do método da interface, personalizado para a classe atual, usado para colocar algo na tela
        System.out.println("You have created WindowsButton.");
    }
}
