package com.vehicles;

public class Car extends VehicleManufacturer implements Vehicle {




    public Car(String vehicleName, String vehivleModelName, String vehicleType)
    {
        super.setVehicleName(vehicleName);
        super.setVehivleModelName(vehivleModelName);
        super.setVehicleType(vehicleType);

    }

    @Override
    public int maxSpeed(String vehicleType) {
        int maxSpeed=0;

        if (vehicleType.equals("sportsCar")) {
            maxSpeed = 250;
            return maxSpeed;
        } else if (vehicleType.equals("cruiser")) {
            maxSpeed=170;
            return maxSpeed;
        }
        else
        {
            return maxSpeed;
        }


    }
    public String getManufacturerInformation()
    {
        return "VehicleManufacturer{" +
                "vehicleName='" + getVehicleName() + '\'' +
                ", vehivleModelName='" + getVehivleModelName() + '\'' +
                ", vehicleType='" + getVehicleType() + '\'' +
                '}';
    }
}
