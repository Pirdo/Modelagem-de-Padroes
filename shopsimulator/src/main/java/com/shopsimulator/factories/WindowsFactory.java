package com.shopsimulator.factories;

import com.shopsimulator.button.Button;
import com.shopsimulator.button.WindowsButton;
import com.shopsimulator.checkbox.Checkbox;
import com.shopsimulator.checkbox.WindowsCheckbox;

public class WindowsFactory implements GUIFactories{
    @Override
    //adiciona a implementação do método da interface, personalizado para a classe atual, retornando um novo botão do Windows
    public Button createButton() {
        //retorna um novo botão do Windows
        return new WindowsButton();
    }

    @Override
    //adiciona a implementação do método da interface, personalizado para a classe atual, retornando um novo checkbox do Windows
    public Checkbox createCheckbox() {
        //retorna um novo botão do Windows
        return new WindowsCheckbox();
    }
}
