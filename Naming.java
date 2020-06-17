public class Naming {
  public static void main(String[] args) {
    FirstName fn = new FirstName();

    fn.setFirstName("Judy");
    System.out.printf("Hi! nice to meet you, %s!\n",  fn.getFirstName());
  }
}