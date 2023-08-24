import java.util.ArrayList;

public class Eggs extends Item {
    private int numberOfEggs;
    private String bestBeforeDate;
    static final int lowerBound = 111111;
    static final int upperBound  = 999999;
    private ArrayList<Action> action = new ArrayList<>();

    public Eggs(String name, String brand, double price, String description, int numberOfEggs, String bestBeforeDate, PricingStrategy pricingStrategy){

        super(name, brand, price, description, Utility.generateID(lowerBound,upperBound), pricingStrategy);
        this.numberOfEggs = numberOfEggs;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public ArrayList<Action> allowableActions() {
        action.add(new AddItemAction(this));
        return action;
    }

    @Override
    public String toString(){
        return super.toString() + "Number of eggs: " + this.numberOfEggs + "\n" +"Best before: " + this.bestBeforeDate+"\n";
    }

}
