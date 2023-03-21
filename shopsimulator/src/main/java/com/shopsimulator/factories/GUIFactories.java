package com.shopsimulator.factories;

import com.shopsimulator.button.Button;
import com.shopsimulator.checkbox.Checkbox;

//cria a interface GUIFactiries
public interface GUIFactories {
    //cria o método para de fato criar o botão
    Button createButton();
    //cria o método para de fato criar o checkbox
    Checkbox createCheckbox();
}
