import java.util.Scanner;
import java.util.Arrays;

public class JavaLab {

  public static void main(String[] args) {
    String selected = args[0];
    JavaLab lab = new JavaLab();

    switch (selected) {
      case "1":
        lab.checkPrime();
        break;

      case "2":
        lab.printDArr();
        break;

      case "3":
        lab.printSquare();
        break;

      case "4":
        lab.findSecondSmallNum();
        break;

      default:
        System.out.println("Q 1-4 are only avaliable.");
        break;
    }
  }

  // Q1
  public void checkPrime() {
    System.out.println("Enter a number to estimate it is a Prime number:");

    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();

    System.out.printf("%d is %s\n", number, isPrime(number) ? "Prime number" : "NOT prime number");
  }

  public boolean isPrime(int number) {
    if (number == 1) return false;
    if (number == 2) return true;

    boolean res = true;

    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        res = false;
        break;
      }
    }

    return res;
  }

  // Q2
  public void printDArr() {
    int[][] arr = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 }, { 21, 22, 23, 24, 25 } };

    for (int[] r : arr) {
      for (int e : r) {
        System.out.printf("%d%s", e, e % 5 == 0 ? "" : ", ");
      }
      System.out.println();
    }
  }

  // Q3
  public void printSquare() {
    for (int i = 0; i < 6; i++) {
      for (int j = 0; j < 6; j++) {
        if (j < i)
          System.out.print("-");

        if (j == i)
          System.out.print(12 * (i + 1));

        if (j > i)
          System.out.print("-");
      }
      System.out.println();
    }
  }

  // Q4
  public void findSecondSmallNum() {
    System.out.println("Enter a length of array:");

    Scanner scanner = new Scanner(System.in);
    int length = scanner.nextInt();

    int[] numbers = new int[length];
    int i = 0;

    while (i < length) {
      System.out.println("Enter a number of array:");
      numbers[i] = scanner.nextInt();
      i++;
    }
    scanner.close();

    Arrays.sort(numbers);
    System.out.printf("The second smallest number is: %d\n", numbers[1]);
  }
}