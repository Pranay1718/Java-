package com.vehicles;

public class Manual extends Transmission{

    private double fifthGearRatio;
    private double sixthGearRatio;

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

    public Manual(String model, int forwardGears, double firstGearRatio, double secondGearRatio, double thirdGearRatio, double fourthGearRatio,double fifthGearRatio,double sixthGearRatio) {
        super(model, forwardGears, firstGearRatio, secondGearRatio, thirdGearRatio, fourthGearRatio);
        this.fifthGearRatio=fifthGearRatio;
        this.sixthGearRatio=sixthGearRatio;

    }



        @Override
        public void showSpecs () {
            System.out.println("Type of Transmission  : Manual ");
        if(getModel().equals("MP4"))
        {

            super.showSpecs();
        }
        else if(getModel().equals("MP5"))
        {

            super.showSpecs();
            System.out.println("6. 5th Gear Ratio      : "+getFifthGearRatio());
        }
        else if(getModel().equals("MP6"))
        {

            super.showSpecs();
            System.out.println("6. 5th Gear Ratio     : "+getFifthGearRatio());
            System.out.println("7. 6th Gear Ratio     : "+getSixthGearRatio());

        }
        else if(getModel().equals("MD5"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio     : "+getFifthGearRatio());
        }
        else if(getModel().equals("MD6"))
        {
            super.showSpecs();
            System.out.println("6. 5th Gear Ratio     : "+getFifthGearRatio());
            System.out.println("7. 6th Gear Ratio     : "+getSixthGearRatio());

        }


    }
}
