import java.util.List;
/**
 * Some
 */
public class Some {
  public static class Sup {
    public String name = "SUP";
  }

  public static class Sub extends Sup {
    public String name = "SUB";
    public String name2 = "SU222B";
  }

  public static void main(String[] args) {
    // Sub s = new Sup();
    Sup s = new Sub();

    System.out.println(s.name);
    System.out.println((Sub)s.name2);
  }

}