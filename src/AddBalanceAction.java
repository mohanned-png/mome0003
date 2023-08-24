

import java.util.Scanner;

public class AddBalanceAction implements Action {
    public AddBalanceAction() {
    }

    @Override
    public String execute(User user, Supermarket supermarket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the balance amount you want to add?");
        int amount = Integer.parseInt(scanner.nextLine());
        user.addBalance(amount);
        return "Balance amount of " + amount + " has been added.";
    }

    @Override
    public String menuDescription() {
        return "Add Balance";
    }
}
