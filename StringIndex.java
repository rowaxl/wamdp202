import java.util.Scanner;
/**
 * StringIndex
 */
public class StringIndex {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your name: ");

    String greet = "Nice to meet you, " + scan.nextLine() + "!";

    scan.close();

    for (int i = 0; i < greet.length(); i++) {
      System.out.println(greet.charAt(i));
    }
  }
}