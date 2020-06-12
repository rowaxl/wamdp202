import java.util.Arrays;
import java.util.OptionalInt;

public class SumArray {
  public static void main(String[] args) {
    int[] nums = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

    OptionalInt sum = Arrays.stream(nums).reduce((n1, n2) -> n1 + n2);

    if (sum.isPresent()) {
      System.out.printf("Sum: %d", sum.getAsInt());
    }

  }
}