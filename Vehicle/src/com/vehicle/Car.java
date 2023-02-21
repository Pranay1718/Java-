package com.vehicle;

public class Car extends Vehicle {

    private int noOfWheels;

    @Override
    public String toString() {
        return "Car{" +
                "noOfWheels=" + noOfWheels +
                ", noOfSeats=" + noOfSeats +
                '}';
    }

    private int noOfSeats;

    public Car(String brake,String engine,int noOfWheels,int noOfSeats)
    {
        super(brake,engine);
        this.noOfWheels=noOfWheels;
        this.noOfSeats=noOfSeats;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }

    public void setNoOfWheels(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}
