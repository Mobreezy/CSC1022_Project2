/*Mohammed Ali
 * 08/12/19
 * Student Number: 18031009
 * This class builds a sandwich with its ingredients and put it into a receipt
 * */
public class SandwichTestBuild {
    public static void main(String[] args) {
        //Intializing a sandwich object
        Sandwich s = new Sandwich(new Bread("Itallian Bread", 1.0, true, true, true, true, false));
        //Adds filling and toppings to the sandwich object
        s.addFilling( new Filling("Chicken", 1.0, true, true, true, true, false));
        s.addTopping( new Topping("ketchup", 1.0, true, true, true, true, false));
        //Prints the receipts
        SandwichReport.report(s);

    }
}
