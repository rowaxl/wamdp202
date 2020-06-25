import java.util.Scanner;

public class DoSomethingMain {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a sentence to trim whole spaces: ");

    System.out.println(DoSomething.substringBlank(scanner.nextLine()));
    scanner.close();
  }
}