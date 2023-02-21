package com.furniture;

public class FurnitureItemImpl {
    public static void main(String [] args)
    {
        FurnitureItem f1=new FurnitureItem();
        f1.setFurnitureCode(233);
        f1.setFurnitureType("chair");
        f1.setGradeOfFurniture(1);
        f1.setFurnitureUsage("outdoor");
        f1.setColor("red");
        f1.setPrice(100);
        double dis=f1.calculateDiscount();
        System.out.println("The Price is "+dis);

    }

}
