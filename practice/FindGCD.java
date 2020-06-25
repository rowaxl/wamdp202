import java.util.Scanner;

public class FindGCD {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int lesser, greater = 0;

    System.out.println("Enter two numbers for finding GCD!");
    System.out.println("First number: ");
    int num1 = scanner.nextInt();

    System.out.println("Second number: ");
    int num2 = scanner.nextInt();

    scanner.close();

    if (num1 == num2) {
      System.out.printf("GCD of two equal number is %d", num1);
      return;
    }

    lesser = num1 < num2 ? num1 : num2;
    greater = num1 < num2 ? num2 : num1;

    int gcd = lesser;
    while (gcd > 1) {
      if (greater % gcd == 0) {
        break;
      }

      gcd--;
    }

    System.out.printf("GCD of %d and %d is %d\n", num1, num2, gcd);
  }
}