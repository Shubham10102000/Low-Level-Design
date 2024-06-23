package com.lld.behavioral.strategy.withStrategy.startegy.drive;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("normal drive capabilities");
    }
}
