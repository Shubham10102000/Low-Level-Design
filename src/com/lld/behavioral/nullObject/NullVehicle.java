package com.lld.behavioral.nullObject;

public class NullVehicle implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 0;
    }

    @Override
    public int getSeatingCapacity() {
        return 0;
    }
}
