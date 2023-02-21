package com.vehicles;

public class VehicleManufacturerImpl {
    public static void main(String[] args)
    {
        VehicleManufacturer bike=new Bike("Duacti","h4","sportsBike");

        Vehicle v1=new Bike("Duacti","h4","sportsBike");
        int speed=v1.maxSpeed(bike.getVehicleType());
        System.out.println("Bike is of Type "+bike.getVehicleType()+" of max Speed "+ speed);
        System.out.println(bike.getManufacturerInformation());

        VehicleManufacturer car=new Car("Mercedes","AMG GLS600","sportsCar");
        Vehicle v2=new Car("Mercedes","AMG GLS600","sportsCar");
        int speed2=v2.maxSpeed(car.getVehicleType());
        System.out.println("Bike is of Type "+car.getVehicleType()+" of max Speed "+ speed2);

        System.out.println(car.getManufacturerInformation());
    }
}
