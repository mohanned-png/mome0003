

import java.util.ArrayList;
import java.util.List;

public class User {

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    private final ShoppingCart shoppingCart;
    private int balance;
    public User(){
        shoppingCart = new ShoppingCart();
        balance = 0;
    }


//    public void addItem(Items.Item item){this.shoppingCart.addItem(item);}
//    public void increaseQuanitity(int index){shoppingCart.increaseQuantity(index);}
//    public Items.Item decreaseQuantity(int index){
//        return shoppingCart.decreaseQuantity(index);}


    public void addBalance(int amount){
        this.balance += amount;
    }
    public void deductBalance(int amount){
        this.balance -= amount;
    }

    public int getshoppingCartSize(){
        return shoppingCart.getShoppingCartSize();
    }

    public void clearShoppingCart(){
        shoppingCart.clearShoppingCart();
    }

    public int getTotalPrice(){
        return shoppingCart.getTotalPrice();
    }

    public ArrayList<Action> allowableActions(){
        ArrayList<Action> Actions = new ArrayList<>(List.of(new AddBalanceAction(),new ConfirmPurchaseAction(), new DisplayShoppingCartAction())) ;
        return  Actions;

    }

    public String toString(){
        String temp = "Balance: " +this.balance +"\n";
        if (shoppingCart.getShoppingCartSize()==0) {

            return "Balance: " +this.balance +"\n" + "Your shopping cart is empty";
        }

        else{
            return "Balance: " +this.balance +"\n\n"+ this.shoppingCart.toString() +"\n";
        }


    }
}
