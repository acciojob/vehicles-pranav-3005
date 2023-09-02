package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int capacity;

    public String getVehicleName()
    {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}