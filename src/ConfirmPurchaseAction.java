public class ConfirmPurchaseAction implements Action {
    @Override
    public String execute(User user, Supermarket supermarket) {
        int total = user.getTotalPrice();
        user.deductBalance(total);
        user.clearShoppingCart();
        supermarket.createItems();
        return "Confirmed Purchase. Restocked the supermarket ";
    }

    @Override
    public String menuDescription() {
        return "Confirms Purchase";
    }


}
