package com.lld.behavioral.strategy.withStrategy;

import com.lld.behavioral.strategy.withStrategy.startegy.drive.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
