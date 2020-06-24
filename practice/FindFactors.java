import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindFactors {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number for find factors: ");
    int target = scanner.nextInt();
    final int org = target;
    scanner.close();

    List<Integer> facts = new ArrayList<Integer>();
    for (int i = 2; i < org; i++) {
      if (target % i == 0) {
        while (target % i == 0) {
          facts.add(i);
          target /= i;
        }
      }
    }

    for (int e : facts) {
      System.out.printf("%d ", e);
    }
    System.out.println();
  }
}
