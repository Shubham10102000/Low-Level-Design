package com.lld.behavioral.command.receiver;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOnAC() {
        isOn = true;
        System.out.println("Turning AC on");
    }

    public void turnOffAC() {
        isOn = false;
        System.out.println("Turning AC off");
    }

    public void setTemprature(int temperature) {
        this.temperature = temperature;
    }
}
