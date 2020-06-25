import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ClassScores {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many subjects did you take?");
    int length = scanner.nextInt();
    List<Integer> scores = new ArrayList<Integer>();

    while (scores.size() < length) {
      System.out.println("Enter your grade: ");
      scores.add(scanner.nextInt());
    }
    scanner.close();

    System.out.printf("Average of Your grades%s are %.1f",
      scores.toString(),
      scores.stream().mapToDouble(v -> v).average().getAsDouble());
  }
}