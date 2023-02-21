package com.vehicles;

public class Bike extends VehicleManufacturer implements Vehicle {

    public Bike(String vehicleName, String vehivleModelName, String vehicleType)
    {

        super.setVehicleName(vehicleName);
        super.setVehivleModelName(vehivleModelName);
        super.setVehicleType(vehicleType);
    }

    @Override
    public int maxSpeed(String vehicleType) {

        int maxSpeed=0;
        if (vehicleType.equals("sportsBike")) {
            maxSpeed = 300;
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

