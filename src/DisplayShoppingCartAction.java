

public class DisplayShoppingCartAction implements Action {

    @Override
    public String execute(User user, Supermarket supermarket) {
        return user.toString();
    }

    @Override
    public String menuDescription() {
        return  "View Shopping Cart";
    }
}
