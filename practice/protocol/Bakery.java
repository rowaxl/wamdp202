/**
 * Bakery
 */
public class Bakery {
  private BakeryInterface c;

  public void setCustomer(BakeryInterface c) {
    this.c = c;
  }

  public void prepareCake() {
    String base = this.c.getBaseTaste();
    String size = this.c.getSize();
    double price = this.c.getPrice();

    c.cakeIsPrepared(String.format("%s sized %s cake ($%.2f)", size, base, price));
  }

  public static void main(String[] args) {
    Bakery b = new Bakery();
    b.setCustomer(new Customer("Chocolate", 12.6));
    b.prepareCake();

    b.setCustomer(new CakeShop("Fruits", "Big", 30));
    b.prepareCake();
  }
}