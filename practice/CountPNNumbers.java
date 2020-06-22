import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class CountPNNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter integers and space. Input 0 when it is end: ");

    int countPositive = 0;
    int countNegative = 0;
    int sum = 0;

    List<Integer> inputs = Arrays.stream(scanner.nextLine().split(" ")).map(e -> Integer.valueOf(e))
        .collect(Collectors.toList());
    scanner.close();

    if (inputs.get(0) == 0 || inputs.size() < 1 || inputs.get(inputs.size() - 1) != 0) {
      System.out.println("No valid numbers are enterd");
      System.exit(1);
    }

    for (Integer n : inputs) {
      if (n == 0)
        break;

      if (n > 0)
        ++countPositive;

      if (n < 0)
        ++countNegative;

        sum += n;
    }

    System.out.printf("Numbers of positive: %d\n", countPositive);
    System.out.printf("Numbers of negative: %d\n", countNegative);
    System.out.printf("Sum: %d\n", sum);
    System.out.printf("Avg: %.2f\n", (double)sum / (inputs.size() - 1));
  }
  
}
