
;

import java.util.ArrayList;

public class Supermarket {

    ArrayList<Item> itemsArray = new ArrayList<>();
    private User user;
    private  ArrayList<Action> action = new ArrayList<>();

    public void deleteItem(Item item){
        itemsArray.remove(item);
    }

    public Supermarket() {
        this.user = new User();
        createItems();
    }

    public void createItems () {

        itemsArray.add(new Eggs(
                "Free Range Items.Eggs 12 pack",
                "Egg-ceptional Items.Eggs",
                5.20,
                "Start your day with Egg-ceptional Items.Eggs, laid by free-range hens and guaranteed to be egg-cellent.",
                12,
                "2023-12-06",
                new RegularPricingStrategy()));

        itemsArray.add(new Eggs(
                "Free Range Items.Eggs 12 pack",
                "Egg-straordinary Items.Eggs",
                4.80,
                "The perfect choice for discerning egg lovers who appreciate the egg-ceptional taste, ethical sourcing, and the joy of cooking with eggs that are simply egg-straordinary",
                12, "2023-09-09", new RegularPricingStrategy()));

        itemsArray.add(new Fruit("Navel Orange", "Honeybells", 0.80,
                "With every bite, you'll experience a zesty explosion of flavour that will make you say, \"Orange you glad I picked this one?\""
                , Fruit.Ripeness.Ripe, new RegularPricingStrategy()));

        itemsArray.add(new Fruit("Fresh Banana",
                "Chiquita",
                0.72,
                "Savour the naturally sweet flavour that will make you say, \"Isn't this banana a-peel-ing?\"",
                Fruit.Ripeness.Underripe, new RegularPricingStrategy()));

        itemsArray.add(new Beverage(
                "Espresso Iced Coffee",
                "Brew-tiful Beans",
                4.50,
                "Get ready to embark on a brew-tiful journey of flavour and boldness that will leave you craving for more. It's time to let your taste buds espresso themselves!",
                750,
                false, new RegularPricingStrategy()));
        itemsArray.add(new Beverage(
                "Sparkling Wine",
                "Wine not",
                20.00,
                "Life is too short to settle for anything less than a sparkling adventure!",
                300,
                true, new RegularPricingStrategy()));


    }

    public  ArrayList<Action> allowableActions(){
        action.add(new DisplayItemsAction(this));
        return null;
    }

    public void showMenu() {
        Menu menu = new Menu();

        ArrayList<Action> action = new ArrayList<>();
        action.addAll(user.allowableActions());

        for (Item i: itemsArray){
            action.addAll(i.allowableActions());
        }

        Action actionchoice;
        do {
            actionchoice = menu.showMenu(action);
            actionchoice.execute(user, this);

        } while (actionchoice != null);
    }


    public void printStatus () {
        System.out.println("Welcome to FIT2099 Supermarket");
        System.out.println("Thank you for visiting FIT2099 Supermarket!");
    }

}