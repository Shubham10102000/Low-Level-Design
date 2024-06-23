package com.lld.behavioral.strategy.withStrategy;

import com.lld.behavioral.strategy.withStrategy.startegy.drive.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
