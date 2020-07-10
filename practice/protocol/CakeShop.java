/**
 * CakeShop
 */
public class CakeShop implements BakeryInterface {
  private String taste;
  private String size;
  private double price;

  public CakeShop(String taste, String size, double price) {
    this.taste = taste;
    this.size = size;
    this.price = price * 0.70;
  }


  @Override
  public String getBaseTaste() {
    return this.taste;
  }

  @Override
  public String getSize() {
    return this.size;
  }

  @Override
  public double getPrice() {
    return this.price;
  }

  @Override
  public void cakeIsPrepared(String message) {
    System.out.printf("We are ready to sell: %s\n", message);
  }
}