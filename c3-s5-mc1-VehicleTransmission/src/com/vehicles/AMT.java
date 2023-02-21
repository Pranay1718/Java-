package com.vehicles;

public class AMT extends Transmission{

    double fifthGearRatio;

    public double getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(double fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    public AMT(String model, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio) {
        super(model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio=fifthGearRatio;
    }

    @Override
    public void showSpecs() {
        System.out.println("Type of Transmission  : AMT ");
        if(getModel().equals("AMTP4"))
        {
            super.showSpecs();
        }
        if(getModel().equals("AMTP"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio     : "+getFifthGearRatio());
        }

    }
}
