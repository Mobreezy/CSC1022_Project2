/*
 * This is and abstract class which implements the interface priceable
 * */
public abstract class Food implements Priceable {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
