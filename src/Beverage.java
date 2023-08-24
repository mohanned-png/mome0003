import java.util.ArrayList;

public class Beverage extends Item {
    private double volume;
    private Boolean carbonated;
    static final int lowerBound =  11111;
    static final int upperBound  = 99999;
    private ArrayList<Action> action = new ArrayList<>();

    public Beverage(String name, String brand, double price, String description, double volume, Boolean carbonated, PricingStrategy pricingStrategy) {
        super(name, brand, price, description, Utility.generateID(lowerBound, upperBound), pricingStrategy);
        this.volume = volume;
        this.carbonated = carbonated;


    }
    private String booleanToString() {
        return carbonated ? "Yes" : "No";
    }

    @Override
    public ArrayList<Action> allowableActions() {
        action.add(new AddItemAction(this));
        return action;
    }

    @Override
    public String toString(){
        return super.toString() + "Volume: " + this.volume +"mL" +"\nIs carbonated? " +  booleanToString()+"\n";
    }
}
