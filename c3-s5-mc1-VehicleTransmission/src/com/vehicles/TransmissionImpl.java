package com.vehicles;

public class TransmissionImpl {
    public static void main(String[] args) {


        /*Transmission t1 = new Manual("MP4", 4, 3.010, 2.070, 1.430, 1.000, 0.710, 0.570);
        t1.showSpecs();
        Transmission t2 = new AMT("AMTP4",4,2.540,1.920,1.510,1.000,0.630);
        t2.showSpecs();
        Transmission t3=new AutomaticCVT("CVT6",6,2.631,1.440,1.165,0.906,0.680,0.499);
        t3.showSpecs();
        Transmission t4=new AutomaticDCT("DCT8",8,4.714,3.143,2.106,1.667,1.285,1.000,0.839,0.667);
        t4.showSpecs();*/
        AutomaticCVT t5=new AutomaticCVT("CVT6",6,2.631,1.440,1.165,0.906,0.680,0.499);
        t5.showSpecs();
        //t1.showSpecs();
        //System.out.println("");

        // String a= t4.getModel();

        /*if(a.equals("MP4")||a.equals("MP5")||a.equals("MP6")||a.equals("MD5")||a.equals("MD6"))
        {
            t1.showSpecs();
        }
        if(a.equals("AMTP4")||a.equals("AMTD5"))
        {
            t2.showSpecs();
        }
        if(a.equals("CVT6"))
        {
            t3.showSpecs();
        }
        if(a.equals("DCT8"))
        {
            t4.showSpecs();
        }
*/
    }
}