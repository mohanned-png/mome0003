
public class AddItemQuantityAction implements Action {

    CartItem cartitem;
    public AddItemQuantityAction(CartItem cartitem) {
        this.cartitem = cartitem;
    }

    @Override
    public String execute(User user, Supermarket supermarket) {

        cartitem.addQuantity();
        return "Items.Item quantity  has been increased by 1";
    }
    @Override
    public String menuDescription () {
        return "Increased item 1 quantity by 1 ";
    }
}

