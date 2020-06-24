public class Pow1 {
  public static void main(String[] args) {
    double sent = 12000.0;
    double root = Math.sqrt(sent);
    double croot = Math.cbrt(sent);

    System.out.println(Math.round(root));
    System.out.println(Math.floor(croot));
  }
}
