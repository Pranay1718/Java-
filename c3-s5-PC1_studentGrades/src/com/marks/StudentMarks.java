package com.marks;

public class StudentMarks {

    public int calculateMarks(int math,int phy,int chem,int bio)
    {
        int sum=math+phy+chem+bio;
        return sum;
    }
    public int calculateMarks(int math, int phy,int chem)
    {
        int sum=math+phy+chem;
        return sum;
    }
    public float calculateMarks(float finance,float accounting,float businessStudies)
    {
        float sum=finance+accounting+businessStudies;
        return sum;
    }
}
