package com.bridge.example;

import com.bridge.devices.Tv;
import com.bridge.remotes.AdvancedRemote;
import com.bridge.remotes.BasicRemote;
import com.bridge.devices.Device;
import com.bridge.devices.Radio;

public class Demo {
    public static void main(String[] args) {
        testDrive(new Tv());
        testDrive(new Radio());
    }

    public static void testDrive(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.channelUp();
        device.printStatus();
    }
}
