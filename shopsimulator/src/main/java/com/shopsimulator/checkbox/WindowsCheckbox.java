package com.shopsimulator.checkbox;

//cria a classe WindowsCheckbox que implementa a interface Checkbox, ou seja, seus métodos
public class WindowsCheckbox implements Checkbox{
    //cria o método paint, para colocar o elemento na tela
    public void paint () {
        //adiciona a implementação do método da interface, personalizado para a classe atual, usado para colocar algo na tela
        System.out.println("You have created WindowsCheckbox.");
    }
}
