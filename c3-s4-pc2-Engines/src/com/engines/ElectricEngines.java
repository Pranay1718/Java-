package com.engines;

public class ElectricEngines extends Engines{

    private double torque;

    @Override
    public String toString() {
        return "ElectricEngines{" +
                "modelNo= " + getModelNo() +", displacement= " + getDisplacement() +
        ", maxPower= " + getMaxPower() +
                ", maxRpm= " + getMaxRpm() +
                ", noOfCylinders= " + getNoOfCylinders() +
                ", torque= " + torque +
                ", noOfBatteries= " + noOfBatteries +
                '}';
    }

    private int noOfBatteries;

    public ElectricEngines(int modelNo,int displacement,double maxPower, double maxRpm, int noOfCylinders,  double voltage,int noOfBatteries)
    {
        super(modelNo,displacement,maxPower,maxRpm,noOfCylinders);
        this.torque=voltage;
        this.noOfBatteries=noOfBatteries;

    }

    public double getTorque() {
        return torque;
    }

    public void setTorque(double torque) {
        this.torque = torque;
    }

    public int getNoOfBatteries() {
        return noOfBatteries;
    }

    public void setNoOfBatteries(int noOfBatteries) {
        this.noOfBatteries = noOfBatteries;
    }
}
