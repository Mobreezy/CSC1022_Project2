/*
 * This class contains a constructor with 7 parameters which it inherits from Ingredients class
 * */

public class Topping extends Ingredients{
    private String name;

    public Topping(String name, double price, boolean vegetarian, boolean nutFree, boolean dairyFree, boolean glutenFree, boolean spicy) {
        super(name, price, vegetarian, nutFree, dairyFree, glutenFree, spicy);

    }

    public String toString() {
        return String.format("Topping[%s]", name);
    }

}
