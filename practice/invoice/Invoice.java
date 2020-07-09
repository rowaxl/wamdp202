import java.util.ArrayList;

public class Invoice {
  private ArrayList<LineItem> items;
  private Address billingAddress;

  public Invoice() {
    this.items = new ArrayList<LineItem>();
  }

  public void addItem(Product product, int quantity) {
    this.items.add(new LineItem(product, quantity));
  }

  public void setBillingAddress(Address address) {
    this.billingAddress = address;
  }

  public String toString() {
    String invoiceFormat = "\n          I N V O I C E\n\n%s\n\nDescription          Price  Qty  Total\n\n%s\nAMOUNT DUE: $%.2f";

    String stringLineItem = "";
    double totalAmount = 0;
    for (LineItem item: this.items) {
      stringLineItem += item.format() + "\n";
      totalAmount += item.getTotalPrice();
    }

    return String.format(
        invoiceFormat,
        this.billingAddress.getAddress(),
        stringLineItem,
        totalAmount
      );
  }

  public static void main(String[] args) {
    Invoice i1 = new Invoice();

    Address address1 = new Address(
      "Kim's Convenience",
      "100 West Broadway",
      "Vancouver",
      "BC", 
      "V5M 1A1"
      );
    i1.setBillingAddress(address1);

    Product toaster = new Product("Toaster", 29.95);
    i1.addItem(toaster, 3);

    Product dryer = new Product("Hair Dryer", 24.95);
    i1.addItem(dryer, 1);

    Product vacuum = new Product("Car Vacuum", 19.99);
    i1.addItem(vacuum, 2);

    System.out.println(i1);
  }
}