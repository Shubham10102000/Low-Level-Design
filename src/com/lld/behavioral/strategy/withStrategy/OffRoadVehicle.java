package com.lld.behavioral.strategy.withStrategy;

import com.lld.behavioral.strategy.withStrategy.startegy.drive.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}
