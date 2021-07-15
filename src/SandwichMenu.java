/*
 * This Class contains all essential information about a sandwich
 * */

import java.util.Scanner;
import java.util.Map;
import java.util.Set;


public class SandwichMenu {
    public void run() throws Exception {

        Map<String, Sandwich> menu = new SandwichCatalog().getPremadeSandwich();
        System.out.println("Which pizza would you like?");
        Set<String> pizzas = menu.keySet();
        for (String pizza : pizzas) {
            System.out.println(pizza);
        }
        Scanner s = new Scanner(System.in);
        String chosenString = s.nextLine().toUpperCase();
        Sandwich chosen = menu.get(chosenString);
        new SandwichReport().report(chosen);
    }

    public static void main(String[] args) throws Exception {
        SandwichMenu m = new SandwichMenu();
        m.run();

    }

}
