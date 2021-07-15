/*Mohammed Ali
 * 08/12/19
 * Student Number: 18031009
 * */
public class SandwichReport {

    public static void report(Sandwich sandwich) {

        System.out.printf("Your Sandwich is: %s\n ", sandwich.getName());

        System.out.printf("Breakdown: \n");

        Bread b = sandwich.getBread();

        System.out.printf("\tBread: %s : £%s \n", b.getName(), b.getPrice());

        for (Filling f : sandwich.getFillingz()) {
            System.out.printf("\tFilling(s): %s: %s\n", f.getName(), "£" + f.getPrice());
        }

        for (Topping t : sandwich.getToppingz()) {
            System.out.printf("\tTopping(s): %s: £%s\n", t.getName(), t.getPrice());
        }

        System.out.printf("\tSandwich %s Vegetarian\n", (sandwich.isVegetarian()) ? "is" : "is not");
        System.out.printf("\tSandwich %s Nut Free\n", (sandwich.isNutFree()) ? "is" : "is not");
        System.out.printf("\tSandwich %s Dairy Free\n", (sandwich.isDairyFree()) ? "is" : "is not");
        System.out.printf("\tSandwich %s Gluten Free\n", (sandwich.isGlutenFree()) ? "is" : "is not");
        System.out.printf("\tSandwich %s Spicy\n", (sandwich.isSpicy()) ? "is" : "is not");


        System.out.printf("Total before VAT: £" + sandwich.getPrice() + "\n");
        System.out.printf("Total after VAT: £" + sandwich.getFullPrice());

    }
}
