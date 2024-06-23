package com.lld.behavioral.nullObject;

public class VehicleFactory {
    static Vehicle getVehicleObject(String vehicle) {
        if ("Car".equalsIgnoreCase(vehicle)) {
            return new Car();
        }
        return new NullVehicle();
    }
}
