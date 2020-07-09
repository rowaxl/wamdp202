public class Address {
  private String title;
  private String street;
  private String city;
  private String province;
  private String zipcode;

  public Address(
    String title,
    String street,
    String city,
    String province,
    String zipcode
  ) {
    this.title = title;
    this.street = street;
    this.city = city;
    this.province = province;
    this.zipcode = zipcode;
  }

  public String getAddress() {
    return String.format("%s\n%s\n%s, %s %s", this.title, this.street, this.city, this.province, this.zipcode);
  }
}