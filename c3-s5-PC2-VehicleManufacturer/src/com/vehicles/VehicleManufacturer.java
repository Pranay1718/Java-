package com.vehicles;

public abstract class VehicleManufacturer {

    private String vehicleName;
    private String vehivleModelName;
    private String vehicleType;



    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public String getVehivleModelName() {
        return vehivleModelName;
    }

    public void setVehivleModelName(String vehivleModelName) {
        this.vehivleModelName = vehivleModelName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public abstract String getManufacturerInformation();
}

