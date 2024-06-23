package com.lld.behavioral.nullObject;

public class Car implements Vehicle {
    @Override
    public int getTankCapacity() {
        return 12;
    }

    @Override
    public int getSeatingCapacity() {
        return 4;
    }
}
