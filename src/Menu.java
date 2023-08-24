import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Menu {

    private HashMap<Character, Action> hotkeys;

    public Action showMenu(ArrayList<Action> allowableActions){
        char selection;
        hotkeys = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        char Alphabet = 'A';
        System.out.println("########################");

        for (Action action : allowableActions) {

            System.out.println(Alphabet + ": "+ action.menuDescription());
            hotkeys.put(Alphabet, action);
            Alphabet+=1;
        }
        System.out.printf("%s: Exit the system",Alphabet);
        System.out.print("\n\nEnter your choice: ");
        selection = scanner.next().charAt(0);
        return hotkeys.get(selection);

    }
}

