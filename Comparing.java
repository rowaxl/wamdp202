import java.util.Scanner;

public class Comparing {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first number:");
    int number1 = scanner.nextInt();

    System.out.println("Enter the second number:");
    int number2 = scanner.nextInt();

    scanner.close();
    System.out.printf("Bigger int is: %d", number1 > number2 ? number1 : number2);
  }
}