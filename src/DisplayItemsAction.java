public class DisplayItemsAction implements Action {

    Supermarket supermarket;
    public DisplayItemsAction(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public String execute(User user, Supermarket supermarket) {
        return null;
    }

    @Override
    public String menuDescription() {
        String temp  = "";
        for(Item i:supermarket.itemsArray){
            temp += i.toString();
        }
        return temp;
    }
}
