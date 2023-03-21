package com.shopsimulator.app;

import com.shopsimulator.factories.GUIFactories;
import com.shopsimulator.factories.MacOSFactory;
import com.shopsimulator.factories.WindowsFactory;

//cria a classe Demo
public class Demo {
    //cria o método para conficurar a Aplication
    private static Aplication configureAplication() {
        
        //objeto da classe aplication
        Aplication app;
        //objeto da classe GUIFactories
        GUIFactories factory;

        //pega o nome do sistema operacional e passa para caixa baixa
        String osName = System.getProperty("os.name").toLowerCase();
        //verifica se o OS é "mac"
        if(osName.contains("mac")) {
            //cria uma nova factory do MacOS
            factory = new MacOSFactory();
        }
        //caso não seja Mac, ele entra na condição de Windows
        else {
            //cria uma nova factory do Windows
            factory = new WindowsFactory();
        }
        //cria uma nova aplication passando a interface de factory
        app = new Aplication(factory);
        //retorna essa aplication
        return app;
    }
    //cria o método main
    public static void main(String[] args) {
        //chama o método de configuração da aplication através de um objeto da classe Aplication
        Aplication app = configureAplication();
        //coloca o app na tela
        app.paint();
    }
}
