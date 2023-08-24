import java.util.ArrayList;

public class Fruit extends Item {

    private Ripeness ripeness;
    public final static int lowerBound = 11111111;
    public final static int upperBound  = 99999999;
    private PricingStrategy pricingStrategy;
    private ArrayList<Action> action = new ArrayList<>();

    public enum Ripeness{Overripe, Ripe , Underripe, Unripe}

    public Fruit(String name, String brand, double price, String description, Ripeness ripeness, PricingStrategy pricingStrategy){
        super(name, brand, price, description,Utility.generateID(lowerBound,upperBound ), pricingStrategy);
        this.ripeness = ripeness;

    }

    @Override
    public ArrayList<Action> allowableActions() {

        action.add(new AddItemAction(this));
        return action;
    }

    @Override
    public String toString(){
        return super.toString() + "Ripeness: " + this.ripeness  + "\n";

    }



}

