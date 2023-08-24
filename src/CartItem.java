

import java.util.ArrayList;

public class CartItem {
    private Item item;
    private int quantity;
    private static ArrayList<Action> action = new ArrayList<>();

    public CartItem(Item item) {
        item = item;
        this.quantity = 1;
        action.add(new AddItemQuantityAction(this));
        action.add(new RemoveItemQuantityAction(this));

    }

    public Item getItem() {
        return item;
    }
    public int getQuantity(){return this.quantity;}

    public void addQuantity(){
        this.quantity+=1;
    }
    public void decreaseQuantity(){this.quantity-=1;}


    public static ArrayList<Action> allowableActions(){
        return action;
    }


    // This method below is used when removing items in a shoppingCart by setting their quantities to 0.
    public double totalPrice(){
        return this.quantity * item.getPrice();
    }
    @Override
    public String toString(){
        return item.toString() + "Quantity: " + this.quantity + "\nTotal Price: " + totalPrice() + "\n\n";
    }


}
