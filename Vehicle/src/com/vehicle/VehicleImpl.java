package com.vehicle;

public class VehicleImpl {
    public static void main(String [] args) {
        Car car = new Car("ABS", "BS6", 4, 4);
        Vehicle vehicle=new Vehicle("dsfdf",);
        System.out.println("Brake " + car.getBrake());
        System.out.println("Engine "+car.getEngine());
        System.out.println("No. Of Wheels "+car.getNoOfWheels());
        System.out.println(car);
    }

}
