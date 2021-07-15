/*Mohammed Ali
 * 08/12/19
 * Student Number: 18031009
 * This is an interface.
 * */public interface Priceable {

 public static final double VAT_RATE = 0.2;

 public default double getFullPrice() {
  return getPrice() + getVat();
 }

 public default double getVat() {
  return getPrice() * VAT_RATE;
 }

 public double getPrice();

 public String getName();

}
