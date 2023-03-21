package com.shopsimulator.factories;

import com.shopsimulator.button.Button;
import com.shopsimulator.button.MacOSButton;
import com.shopsimulator.checkbox.Checkbox;
import com.shopsimulator.checkbox.MacOSCheckbox;

//cria a classe MacOSFactory que implementa a interface Factory, ou seja, seus métodos
public class MacOSFactory implements GUIFactories {

    @Override
    //adiciona a implementação do método da interface, personalizado para a classe atual, retornando um novo botão do MacOS
    public Button createButton() {
        //retorna um novo botão do MacOS
        return new MacOSButton();
    }

    @Override
    //adiciona a implementação do método da interface, personalizado para a classe atual, retornando um novo checkbox do MacOS
    public Checkbox createCheckbox() {
        //retorna um novo botão do MacOS
        return new MacOSCheckbox();
    }
}
