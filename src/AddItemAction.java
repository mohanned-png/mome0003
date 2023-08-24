
public class AddItemAction implements Action {

    private Item item;

    public AddItemAction(Item item){
        this.item = item;

    }

    @Override
    public String execute(User user, Supermarket supermarket) {
        user.getShoppingCart().addItem(item);
        supermarket.deleteItem(item);


        return String.format("Items.Item %s is added to the user’s shopping cart", item);
    }


    @Override
    public String menuDescription() {
        return item.toString();
    }
}
