package com.vehicles;

public class AutomaticCVT extends Transmission{

    double fifthGearRatio;
    double sixthGearRatio;

    public double getFifthGearRatio() {
        return fifthGearRatio;
    }

    public void setFifthGearRatio(double fifthGearRatio) {
        this.fifthGearRatio = fifthGearRatio;
    }

    public double getSixthGearRatio() {
        return sixthGearRatio;
    }

    public void setSixthGearRatio(double sixthGearRatio) {
        this.sixthGearRatio = sixthGearRatio;
    }

    public AutomaticCVT(String model, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio) {
        super(model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio=fifthGearRatio;
        this.sixthGearRatio=sixthGearRatio;

    }

    @Override
    public void showSpecs() {
        System.out.println("Type of Transmission : Automatic - CVT ");
        super.showSpecs();
        System.out.println("6. 5th Gear Ratio    : "+getFifthGearRatio());
        System.out.println("7. 6th Gear Ratio    : "+getSixthGearRatio());
    }
}
