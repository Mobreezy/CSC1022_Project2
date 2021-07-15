/*
 * This Class contains all essential information about a sandwich
 * */
import java.util.*;




public class Sandwich extends Food {

    private Bread bread;
    private List<Filling> fillingz = new ArrayList<Filling>();
    private List<Topping> toppingz = new ArrayList<Topping>();


    public Sandwich(Bread bread) {
        this(null, bread);

    }

    public Sandwich(String name, Bread bread) {
        super(name);
        this.bread = bread;

    }

    public Sandwich(String name, Bread bread, Topping[] topping, Filling[] filling) {
        this(name, bread);
        toppingz.addAll(Arrays.asList(topping));
        fillingz.addAll(Arrays.asList(filling));
    }



    public void addTopping(Topping topping) {
        toppingz.add(topping);
    }

    public void addFilling(Filling filling) {
        fillingz.add(filling);
    }


    public Bread getBread() {
        return bread;
    }

    public List<Topping> getToppingz() {
        return Collections.unmodifiableList(toppingz);
    }

    public List<Filling> getFillingz() {
        return Collections.unmodifiableList(fillingz);
    }


    public double getPrice() {
        double price = 0;
        for (Topping t : toppingz) {
            price += t.getPrice();
        }
        for (Filling f : fillingz) {
            price += f.getPrice();
        }
        return price + bread.getPrice();
    }

    public boolean isVegetarian() {

        for (Topping t : toppingz) {
            if (!t.isVegetarian()) {
                return false;
            }

            for (Filling f : fillingz) {
                if (!f.isVegetarian()) {
                    return false;
                }

            }
        }
        return bread.isVegetarian();

    }

    public boolean isNutFree() {

        for (Topping t : toppingz) {
            if (!t.isNutFree()) {
                return false;
            }
        }

        for (Filling f : fillingz) {
            if (!f.isNutFree()) {
                return false;
            }

        }
        return bread.isNutFree();
    }

    public boolean isDairyFree() {

        for (Topping t : toppingz) {
            if (!t.isDairyFree()) {
                return false;
            }

        }
        for (Filling f : fillingz) {
            if (!f.isDairyFree()) {
                return false;
            }
        }
        return bread.isDairyFree();
    }

    public boolean isGlutenFree() {

        for (Topping t : toppingz) {
            if (!t.isGlutenFree()) {
                return false;
            }
        }

        for (Filling f : fillingz) {
            if (!f.isGlutenFree()) {
                return false;
            }
        }
        return bread.isGlutenFree();
    }

    public boolean isSpicy() {

        for (Topping t : toppingz) {
            if (!t.isSpicy()) {
                return false;
            }
        }
        for (Filling f : fillingz) {
            if (!f.isSpicy()) {
                return false;
            }
        }
        return bread.isSpicy();
    }


}

