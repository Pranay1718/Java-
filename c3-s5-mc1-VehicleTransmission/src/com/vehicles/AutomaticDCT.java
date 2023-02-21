package com.vehicles;

public class AutomaticDCT extends Transmission {

    double fifthGearRatio;
    double sixthGearRatio;
    double sevenGearRatio;
    double eightGearRatio;

    public AutomaticDCT(String model, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio, double fifthGearRatio, double sixthGearRatio, double sevenGearRatio, double eightGearRatio) {
        super(model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio = fifthGearRatio;
        this.sixthGearRatio = sixthGearRatio;
        this.sevenGearRatio = sevenGearRatio;
        this.eightGearRatio = eightGearRatio;

    }

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

    public double getSevenGearRatio() {
        return sevenGearRatio;
    }

    public void setSevenGearRatio(double sevenGearRatio) {
        this.sevenGearRatio = sevenGearRatio;
    }

    public double getEightGearRatio() {
        return eightGearRatio;
    }

    public void setEightGearRatio(double eightGearRatio) {
        this.eightGearRatio = eightGearRatio;
    }

    @Override
    public void showSpecs() {
        System.out.println("Type of Transmission  : Automatic - DCT ");
        super.showSpecs();
        System.out.println("6. 5th Gear Ratio     : "+getFifthGearRatio());
        System.out.println("7. 6th Gear Ratio     : "+getSixthGearRatio());
        System.out.println("8. 7th Gear Ratio     : "+getSevenGearRatio());
        System.out.println("9. 5th Gear Ratio     : "+getEightGearRatio());

    }
}