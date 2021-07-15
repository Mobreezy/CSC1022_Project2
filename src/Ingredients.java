/*
 * This class contains all properties for the ingredients of the sandwich
 * */

public class Ingredients extends Food {


    private double price;
    private boolean vegetarian;
    private boolean nutFree;
    private boolean dairyFree;
    private boolean glutenFree;
    private boolean spicy;

    public Ingredients(String name, double price, boolean vegetarian, boolean nutFree, boolean dairyFree, boolean glutenFree, boolean spicy) {

        super(name);
        this.price = price;
        this.vegetarian = vegetarian;
        this.nutFree = nutFree;
        this.dairyFree = dairyFree;
        this.glutenFree = glutenFree;
        this.spicy = spicy;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public boolean isNutFree() {
        return nutFree;
    }

    public boolean isDairyFree() {
        return dairyFree;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public boolean isSpicy() {
        return spicy;
    }


    public double taxInclusive() {
        return 0;
    }
}


