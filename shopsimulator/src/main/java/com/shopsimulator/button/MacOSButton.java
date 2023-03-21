package com.shopsimulator.button;

//cria a classe MacOSButton que implementa a interface Button, ou seja, seus métodos
public class MacOSButton implements Button{
    @Override
    //adiciona a implementação do método da interface, personalizado para a classe atual, usado para colocar algo na tela
    public void paint(){
        System.out.println("You have created MacOSButton.");
    }    
}
