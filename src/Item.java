import java.util.ArrayList;

public abstract class Item {
    //Fields
    private String name;
    private String brand;
    private double price;
    private String description;
    private int id;
    private PricingStrategy pricingStrategy;
    private double originalPrice;

    // Constructor
    public Item(String name, String brand, double price, String description, int id, PricingStrategy pricingStrategy) {
        this.name = name;
        this.brand = brand ;
        this.description = description;
        this.id  = id;
        this.pricingStrategy = pricingStrategy;
        this.originalPrice = price;
        this.price = calculatePrice();

    }
    public double calculatePrice() {
        return pricingStrategy.calculateNewPrice(this.price);
    }


    public double getPrice() {
        return price;
    }

    public abstract  ArrayList<Action> allowableActions();
    @Override
    public String toString(){
        return  "Name: " + this.name +
                "\nBrand: " + brand +
                "\nPrice: $" + calculatePrice() +
                "\nDescription: " + this.description
                +"\nID: " +  id +  "\n";

    }
}
