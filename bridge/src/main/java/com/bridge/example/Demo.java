package com.bridge.example;

import com.bridge.devices.Tv;
import com.bridge.remotes.AdvancedRemote;
import com.bridge.remotes.BasicRemote;
import com.bridge.devices.Device;
import com.bridge.devices.Radio;

public class Demo {
    public static void main(String[] args) {
        // Utiliza o método testDrive para testar as funcionalidades da Tv usando os
        // Controles Remotos
        testDrive(new Tv());
        // Utiliza o método testDrive para testar as funcionalidades do Radio usando os
        // Controles Remotos
        testDrive(new Radio());
    }

    // Método para testar as funcionalidades dos controles remotos
    public static void testDrive(Device device) {
        System.out.println("Tests with basic remote.");
        // As interaçōes do controle remoto básico são feitas através dos métodos
        // implementados pela interface Remote, utilizando as características de Device
        // para atribuir os valores dessas implementaçōes ao Device

        // Trás o status do dispositivo
        BasicRemote basicRemote = new BasicRemote(device);
        // Liga o dispositivo com o controle básico
        basicRemote.power();
        // Trás o status do dispositivo
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        // As interaçōes do controle remoto avançado são feitas através dos métodos
        // implementados pela classe BasicRemote, que foi baseada na interface Remote,
        // isso utilizado porque os métodos basicos são os mesmos para todos os
        // controles, utilizando as características de Device para atribuir os valores
        // dessas implementaçōes ao Device

        // Instancia um controle remoto avançado
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        // Desliga o dispositivo
        advancedRemote.power();
        // Desativa o som do dispositivo
        advancedRemote.mute();
        // Trás o status do dispositivo
        device.printStatus();
    }
}
