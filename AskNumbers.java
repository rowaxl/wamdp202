import java.util.Scanner;
import java.util.Arrays;
import java.util.OptionalInt;

public class AskNumbers {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a Length of array:");
    int length = scanner.nextInt();

    int[] nums = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.printf("Enter a Number for element of array[%d]:", i);
      nums[i] = scanner.nextInt();
    }

    scanner.close();

    System.out.printf("Array: %s\n", Arrays.toString(nums));

    OptionalInt sum = Arrays.stream(nums).reduce((n1, n2) -> n1 + n2);

    if (sum.isPresent()) {
      System.out.printf("Sum: %d\n", sum.getAsInt());
    }
  }
}