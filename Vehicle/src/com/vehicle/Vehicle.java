package com.vehicle;

public class Vehicle {

    private String brake;

    @Override
    public String toString() {
        return "Vehicle{" +
                "brake='" + brake + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    private String engine;

    public Vehicle(String brake,String engine)
    {
        this.brake=brake;
        this.engine=engine;
    }

    public String getBrake() {
        return brake;
    }

    public void setBrake(String brake) {
        this.brake = brake;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
