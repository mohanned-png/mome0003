

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<CartItem> listOfCartItems = new ArrayList<CartItem>();
    private ArrayList<Action> actions;
    public void addItem(Item item) {

        listOfCartItems.add(new CartItem(item));
    }

//    public void increaseQuantity(int index){
//        listOfCartItems.get(index).addQuantity();
//    }
//
//    public Items.Item decreaseQuantity(int index) {
//        CartItem cartItem = listOfCartItems.get(index);
//        cartItem.decreaseQuantity();
//        if (cartItem.getQuantity()==0){
//            return cartItem.getItem();
//        }
//        else{return null;}

    //    }
    public void removeItem(CartItem cartItem){
        listOfCartItems.remove(cartItem);
    }

    public int getShoppingCartSize(){
        return listOfCartItems.size();
    }

    public void clearShoppingCart(){listOfCartItems = new ArrayList<CartItem>();}

    public int getTotalPrice(){
        int total = 0;
        for(CartItem item: listOfCartItems){
            total += item.totalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        int index = 1;
        String temp = "Shopping Cart: \n";
        for (CartItem item : listOfCartItems) {

            System.out.printf("(%s) \n", index);
            temp += item.toString();
            index +=1;
        }
        return temp;
    }
}
