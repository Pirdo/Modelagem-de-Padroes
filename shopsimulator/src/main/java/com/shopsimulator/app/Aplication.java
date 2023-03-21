package com.shopsimulator.app;

import com.shopsimulator.button.Button;
import com.shopsimulator.checkbox.Checkbox;
import com.shopsimulator.factories.GUIFactories;

//cria a classe Aplication
public class Aplication {
    //objeto da classe Button
    private Button button;
    //objeto da calsse Checkbox
    private Checkbox checkbox;

    //cria o método que chama os métodos de criação através da interface GUIFactories
    public Aplication(GUIFactories factory) {
        //atribui o metodo de criação do botão a uma variavel
        button = factory.createButton();
        //atribui o metodo de criação do checkbox a uma variavel
        checkbox = factory.createCheckbox();
    }

    //cria o método que chama os métodos de paint, para colocar os elementos na tela, também atravéz das interfaces
    public void paint() {
        //coloca o botão na tela
        button.paint();
        //coloca o checkbox na tela
        checkbox.paint();
    }
}