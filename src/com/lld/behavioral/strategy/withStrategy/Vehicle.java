package com.lld.behavioral.strategy.withStrategy;

import com.lld.behavioral.strategy.withStrategy.startegy.drive.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveStrategy;

    // constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}
