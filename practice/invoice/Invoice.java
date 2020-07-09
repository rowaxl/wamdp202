import java.util.ArrayList;

public class Invoice {
  private ArrayList<LineItem> items;
  private Address billingAddress;

  public Invoice(Address address) {
    this.items = new ArrayList<LineItem>();
    this.billingAddress = address;
  }

  public void addItem(Product product, int quantity) {
    this.items.add(new LineItem(product, quantity));
  }

  public double getTotalAmount() {
    double totalAmount = 0;

    for (LineItem item : this.items) {
      totalAmount += item.getTotalPrice();
    }

    return totalAmount;
  }

  public String toString() {
    String invoiceFormat = "\n          I N V O I C E\n\n%s\n\nDescription          Price  Qty  Total\n\n%s\nAMOUNT DUE: $%.2f";

    String stringLineItem = "";

    for (LineItem item: this.items) {
      stringLineItem += item.format() + "\n";
    }

    return String.format(
        invoiceFormat,
        this.billingAddress.getAddress(),
        stringLineItem,
        this.getTotalAmount()
      );
  }

  public static void main(String[] args) {
    Address address1 = new Address(
      "Kim's Convenience",
      "100 West Broadway",
      "Vancouver",
      "BC", 
      "V5M 1A1"
    );

    Invoice i1 = new Invoice(address1);

    Product toaster = new Product("Toaster", 29.95);
    i1.addItem(toaster, 3);

    Product dryer = new Product("Hair Dryer", 24.95);
    i1.addItem(dryer, 1);

    Product vacuum = new Product("Car Vacuum", 19.99);
    i1.addItem(vacuum, 2);

    System.out.println(i1);
  }
}