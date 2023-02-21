package com.marks;

public class StudentMarksImpl {
    public static void main(String[] args)
    {
        StudentMarks s1=new StudentMarks();
        int a=s1.calculateMarks(98,87,88);
        System.out.println("The total marks of the student of Non medical pathway : "+a+"/300");
        int b=s1.calculateMarks(87,98,87,78);
        System.out.println("The total marks of the student of medical pathway : "+b+"/400");
        float c=s1.calculateMarks(99.0f,98.0f,89.0f);
        System.out.println("The total marks of the student of Business pathway : "+c+"/200");

    }
}
