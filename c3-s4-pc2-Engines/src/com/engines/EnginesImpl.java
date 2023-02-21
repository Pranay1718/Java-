package com.engines;

import java.util.concurrent.Callable;

public class EnginesImpl {
    public static void main(String [] args)
    {
        PetrolEngines petrol=new PetrolEngines(2002,2000,8000,10,3);
        System.out.println(petrol);
        DieselEngines diesel=new DieselEngines(2022,4000,12200,10,3);
        System.out.println(diesel);
        CngEngines cng=new CngEngines(20102,5000,1000,10,3);
        System.out.println(cng);
        ElectricEngines electric=new ElectricEngines(2002,2000,8000,10,5,220,5);
        System.out.println(electric);


    }
}
