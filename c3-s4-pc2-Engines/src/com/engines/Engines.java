package com.engines;

public class Engines {

    private int modelNo;
    private int displacement;
    private double maxPower;
    private double maxRpm;

    @Override
    public String toString() {
        return "Engines{" +
                "modelNo=" + modelNo +
                ", displacement=" + displacement +
                ", maxPower=" + maxPower +
                ", maxRpm=" + maxRpm +
                ", noOfCylinders=" + noOfCylinders +
                '}';
    }

    private int noOfCylinders;

    public Engines(int modelNo,int displacement,double maxPower,double maxRpm,int noOfCylinders)
    {
        this.modelNo=modelNo;
        this.displacement=displacement;
        this.maxPower=maxPower;
        this.maxRpm=maxRpm;
        this.noOfCylinders=noOfCylinders;
    }

    public Engines() {

    }

    public int getModelNo() {
        return modelNo;
    }

    public void setModelNo(int modelNo) {
        this.modelNo = modelNo;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(double maxPower) {
        this.maxPower = maxPower;
    }

    public double getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(double maxRpm) {
        this.maxRpm = maxRpm;
    }

    public int getNoOfCylinders() {
        return noOfCylinders;
    }

    public void setNoOfCylinders(int noOfCylinders) {
        this.noOfCylinders = noOfCylinders;
    }
}
