public class LineItem {
  private Product item;
  private int quantity;

  public LineItem(Product item, int quantity) {
    this.item = item;
    this.quantity = quantity;
  }

  public double getTotalPrice() {
    return item.getPrice() * this.quantity;
  }

  public String format() {
    return String.format("%-20s $%-5.2f  %-2d $%-5.2f",
        item.getDescription(),
        item.getPrice(),
        this.quantity,
        this.getTotalPrice()
      );
  }
}