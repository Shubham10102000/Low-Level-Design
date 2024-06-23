package com.lld.behavioral.nullObject;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle) {
        // we need check vehicle for null to avoid null pointer exception

        System.out.println("Seating Capacity : " + vehicle.getSeatingCapacity() + " people");
        System.out.println("Fuel Tank Capacity : " + vehicle.getTankCapacity() + "L");
    }
}
