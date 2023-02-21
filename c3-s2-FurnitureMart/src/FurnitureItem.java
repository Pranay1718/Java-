public class FurnitureItem {

    String furnitureCode;
    String furnitureType;
    int gradeOfFurniture;
    String colour;
    String furnitureUsage;
    double price;

    public FurnitureItem()
    {
        furnitureCode="3fr32";
        furnitureType="Chair";
        gradeOfFurniture=1;
        colour= "Red";
        furnitureUsage="outdoor";
        price=4343;
    }
    public double calculate()
    {

        if(furnitureUsage.equals("outdoor"))
        {
            System.out.println("Applicable for 5% Discount");
            price=price-price*0.05;
            return price;
        }
        else
            System.out.println("No Discount Provided");
            return price;
    }
    public void display()
    {
        System.out.println("Furniture Code : "+furnitureCode+"\n"+"Furniture Type : "+furnitureType+"\n"+"Grade Of Furniture : "+gradeOfFurniture+"\n"+"Colour : "+colour+"\n"+"Furniture Usage : "+furnitureUsage+"\n"+"Price : "+price);
    }
}
