/*Mohammed Ali
 * 08/12/19
 * Student Number: 18031009
 * This class contains a constructor with 7 parameters which it inherits from Ingredients class
 * */
public class Filling extends Ingredients {

    private String name;

    public Filling(String name, double price, boolean vegetarian, boolean nutFree, boolean dairyFree, boolean glutenFree, boolean spicy) {
        super(name, price, vegetarian, nutFree, dairyFree, glutenFree, spicy);

    }

    public String toString() {
        return String.format("Filling[%s]", name);
    }
}
