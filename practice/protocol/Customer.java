/**
 * Customer
 */
public class Customer implements BakeryInterface {
  private String taste;
  private double price;

  public Customer(String taste, double price) {
    this.taste = taste;
    this.price = price;
  }


  @Override
  public String getBaseTaste() {
    return this.taste;
  }

  @Override
  public String getSize() {
    return "Small";
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public void cakeIsPrepared(String message) {
    System.out.printf("I've got a %s!\n", message);
  }
}