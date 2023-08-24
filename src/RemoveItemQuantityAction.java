public class RemoveItemQuantityAction implements Action {
    CartItem cartitem;
    public RemoveItemQuantityAction(CartItem cartitem) {
        this.cartitem = cartitem;
    }

    @Override
    public String execute(User user, Supermarket supermarket) {


        cartitem.decreaseQuantity();
        if (cartitem.getQuantity()<1){

            supermarket.itemsArray.add(cartitem.getItem());
            user.getShoppingCart().removeItem(cartitem);
        }

        return "Items.Item quantity has been decreased by 1";

    }
    @Override
    public String menuDescription() {
        return "Decreases item quantity";
    }
}
