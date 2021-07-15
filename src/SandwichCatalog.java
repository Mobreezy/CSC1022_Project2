/*
 * This class contains all the properties for bread,fillings and toppings
 * */

import java.util.*;

public class SandwichCatalog {

    private Map<String, Bread> bread;
    private Map<String, Filling> fillingz;
    private Map<String, Topping> toppingz;
    private Map<String, Sandwich> predefined;
    /*This method returns a map of all bread
    * */
    public Map<String, Bread> getBread() {

        if (bread == null) {
            List<Bread> breadList = new ArrayList<Bread>();
            //fillingList.add(new Filling());

            breadList.add(new Bread("ITALIAN BREAD", 1.0, true, true, true, false, false));
            breadList.add(new Bread("HEARTY ITALIAN BREAD", 2.0, true, true, true, false, false));
            breadList.add(new Bread("ITALIAN HERBS AND CHEESE", 2.0, true, true, false, false, false));
            breadList.add(new Bread("CHILI AND PAPRIKA", 1.5, true, true, true, false, true));
            breadList.add(new Bread("GLUTEN FREE BREAD", 2.0, true, true, true, true, false));
            // breadList.add(new Bread());
            bread = nameToObjectMap(breadList);

        }
        return bread;
    }
    /*This method returns a map of all fillings
     * */

    public Map<String, Filling> getFillingz() {
        if (fillingz == null) {
            List<Filling> fillingList = new ArrayList<Filling>();
            //fillingList.add(new Filling());

            fillingList.add(new Filling("VEGGIE PATTY", 0.2, true, true, false, false, false));
            fillingList.add(new Filling("TUNA", 0.4, false, true, true, true, false));
            fillingList.add(new Filling("CHICKEN TIKKA", 0.35, false, true, true, true, false));
            fillingList.add(new Filling("HAM", 0.25, false, true, true, true, false));
            fillingList.add(new Filling("MEATBALLS", 0.5, false, true, true, true, true));
            fillingList.add(new Filling("TURKEY BREAST", 0.32, false, true, true, true, false));
            // toppingList.add(new Topping());
            fillingz = nameToObjectMap(fillingList);

        }
        return fillingz;
    }
    /*This method returns a map of all toppings
     * */
    public Map<String, Topping> getToppingz() {
        if (toppingz == null) {
            List<Topping> toppingList = new ArrayList<Topping>();
            toppingList.add(new Topping("OLIVES", 0.1, true, true, false, false, false));
            toppingList.add(new Topping("PICKLES", 0.1, true, true, true, true, false));
            toppingList.add(new Topping("KETCHUP", 0.2, true, true, true, true, false));
            toppingList.add(new Topping("SALSA", 0.3, true, true, true, true, false));
            toppingList.add(new Topping("CAESAR SAUCE", 0.4, true, true, true, true, true));
            toppingList.add(new Topping("SWEETCORN", 0.1, true, true, true, true, false));
            toppingList.add(new Topping("LETTUCE",0.1,true, true,true,true, false));
            // toppingList.add(new Topping());
            toppingz = nameToObjectMap(toppingList);

        }
        return toppingz;
    }
    //generic
    private static <S extends Priceable> Map<String, S> nameToObjectMap(List<S> list) {
        Map<String, S> map = new HashMap<String, S>();
        for (S s : list) {
            map.put(s.getName(), s);
        }
        return Collections.unmodifiableMap(map);
    }
    //map of premade sandwiches
    public Map<String, Sandwich> getPremadeSandwich() {
        if (predefined == null) {
            Map<String, Bread> b = getBread();
            Map<String, Topping> t = getToppingz();
            Map<String, Filling> f = getFillingz();

            List<Sandwich> sandwichList = new ArrayList<Sandwich>();
            sandwichList.add(new Sandwich("CHICKEN TIKKA", b.get("ITALIAN BREAD"), new Topping[]{t.get("LETTUCE"), t.get("KETCHUP")},
                    new Filling[]{f.get("CHICKEN TIKKA")}));
            sandwichList.add(new Sandwich("VEGGIE DELITE", b.get("GLUTEN FREE BREAD"), new Topping[]{t.get("LETTUCE"), t.get("KETCHUP")},
                    new Filling []{f.get("VEGGIE PATTY")}));
            sandwichList.add(new Sandwich("MEATBALL MARINARA", b.get("ITALIAN HERBS AND CHEESE"), new Topping[]{t.get("LETTUCE"), t.get("SALSA")},
                    new Filling []{f.get("MEATBALLS")}));
            predefined = nameToObjectMap(sandwichList);

        }
        return predefined;
    }

}
