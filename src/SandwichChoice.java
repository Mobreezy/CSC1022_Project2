import java.util.Scanner;
/*Mohammed Ali
 * 08/12/19
 * Student Number: 18031009
 * This class contains a constructor with 7 parameters which it inherits from Ingredients class
 * */
public class SandwichChoice {

    static SandwichCatalog sc = new SandwichCatalog();

    Scanner s = new Scanner(System.in);

    private static void printBread() {
        System.out.println("==================Breads==================");
        for (Bread bread : sc.getBread().values()) {
            System.out.println(bread.getName() + "---£" + bread.getPrice());
        }
        System.out.println("=========================================");

    }


    private static void printTopping() {
        System.out.println("==================Toppings==================");

        for (Topping t : sc.getToppingz().values()) {
            System.out.println(t.getName()+ "---£" + t.getPrice());
        }
        System.out.println("============================================");


    }

    private static void printFilling() {
        System.out.println("==================Fillings==================");

        for (Filling f : sc.getFillingz().values()) {
            System.out.println(f.getName()+ "---£" + f.getPrice());
        }
        System.out.println("===========================================");

    }


    public static void main(String[] args) {
        SandwichCatalog sc = new SandwichCatalog();
        Scanner s = new Scanner(System.in);
        boolean invalidInputs = true;

        do {
            try {
                printBread();
                System.out.println("Choose your choice of bread");

                Bread chosenBread = sc.getBread().get(s.nextLine().toUpperCase());

                System.out.println("You chose: " + chosenBread.getName());

                Sandwich sandwich = new Sandwich(chosenBread);


                System.out.println("Choose the fillings you want and/or type DONE: ");

                printFilling();
                boolean contFill = true;
                while (contFill) {
                    String next = s.nextLine();
                    if (next.equalsIgnoreCase("DONE")) {
                        contFill = false;
                        continue;
                    }
                    Filling filling = sc.getFillingz().get(next.toUpperCase());
                    sandwich.addFilling(filling);
                    System.out.println("You chose: " + filling.getName());
                }

                printTopping();
                System.out.println("Choose a topping, or DONE:");

                boolean contTop = true;
                while (contTop) {
                    String next = s.nextLine();
                    if (next.equalsIgnoreCase("DONE")) {
                        contTop = false;
                        continue;
                    }
                    Topping topping = sc.getToppingz().get(next.toUpperCase());
                    sandwich.addTopping(topping);
                    System.out.println("You chose: " + topping.getName());
                }


                new SandwichReport().report(sandwich);
                break;
            } catch (Exception e) {
                System.out.println("Your input appears to be wrong");
                System.out.println("Please try again");


            }


        } while (invalidInputs);
        s.close();

    }
}




