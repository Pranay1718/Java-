package com.furniture;

public class FurnitureItem {
    private int furnitureCode;
    private String furnitureType;
    private int gradeOfFurniture;
    private String color;
    private String furnitureUsage;
    private double price;

    static final int DISCOUNT=5;

    public int getFurnitureCode() {
        return furnitureCode;
    }

    public void setFurnitureCode(int furnitureCode) {
        this.furnitureCode = furnitureCode;
    }

    public String getFurnitureType() {
        return furnitureType;
    }

    public void setFurnitureType(String furnitureType) {
        this.furnitureType = furnitureType;
    }

    public int getGradeOfFurniture() {
        return gradeOfFurniture;
    }

    public void setGradeOfFurniture(int gradeOfFurniture) {
        this.gradeOfFurniture = gradeOfFurniture;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFurnitureUsage() {
        return furnitureUsage;
    }

    public void setFurnitureUsage(String furnitureUsage) {
        this.furnitureUsage = furnitureUsage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public double calculateDiscount()
    {
        int a=getGradeOfFurniture();
        String b=getFurnitureUsage();
        if(a==1&&b.equals("outdoor"))
        {
            System.out.println("Discount of 5% is provided ");
            //double discount=DISCOUNT/100;


            return getPrice()-getPrice()*DISCOUNT/100;

        }
        else {
            System.out.println("No discount Provided");
            return getPrice();
        }
    }

}
