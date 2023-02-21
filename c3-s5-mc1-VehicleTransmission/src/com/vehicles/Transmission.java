package com.vehicles;

public class Transmission {

    private String model;
    private int forwardGears;
    private double firstGearRatio;
    double secondGearRatio;
    double thirdGearRatio;
    double fourthGearRatio;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getForwardGears() {
        return forwardGears;
    }

    public void setForwardGears(int forwardGears) {
        this.forwardGears = forwardGears;
    }

    public double getFirstGearRatio() {
        return firstGearRatio;
    }

    public void setFirstGearRatio(double firstGearRatio) {
        this.firstGearRatio = firstGearRatio;
    }

    public double getSecondGearRatio() {
        return secondGearRatio;
    }

    public void setSecondGearRatio(double secondGearRatio) {
        this.secondGearRatio = secondGearRatio;
    }

    public double getThirdGearRatio() {
        return thirdGearRatio;
    }

    public void setThirdGearRatio(double thirdGearRatio) {
        this.thirdGearRatio = thirdGearRatio;
    }

    public double getFourthGearRatio() {
        return fourthGearRatio;
    }

    public void setFourthGearRatio(double fourthGearRatio) {
        this.fourthGearRatio = fourthGearRatio;
    }

    public Transmission(String model, int forwardGears, double firstGearRatio,double secondGearRatio,double thirdGearRatio,double fourthGearRatio)
    {

        this.model=model;
        this.forwardGears=forwardGears;
        this.firstGearRatio=firstGearRatio;
        this.secondGearRatio=secondGearRatio;
        this.thirdGearRatio=thirdGearRatio;
        this.fourthGearRatio=fourthGearRatio;

    }

    public void showSpecs()
    {

        System.out.println("Tranmission Model     : "+getModel());
        System.out.println("Key Specifications    : ");
        System.out.println("");
        System.out.println("1. Forward Gears      : "+ getForwardGears());
        System.out.println("2. 1st Gear Ratio     : "+ getFirstGearRatio());
        System.out.println("3. 2nd Gear Ratio     : "+getSecondGearRatio());
        System.out.println("4. 3rd Gear Ratio     : "+getThirdGearRatio());
        System.out.println("5. 4th Gear Ratio     : "+getFourthGearRatio());

    }

}
