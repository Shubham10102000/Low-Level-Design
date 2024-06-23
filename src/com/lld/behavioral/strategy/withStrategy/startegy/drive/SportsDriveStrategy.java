package com.lld.behavioral.strategy.withStrategy.startegy.drive;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("sports drive capabilities");
    }
}
