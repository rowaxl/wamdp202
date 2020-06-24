import java.util.List;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Divisible2 {

  public static void main(String[] args) {
    int[] arr = IntStream.range(100, 200).filter(num -> num % 30 != 0).filter(num -> num % 5 == 0 || num % 6 == 0).toArray();

    for (int i = 0; i < arr.length; i++) {
      if (i % 10 == 0)
        System.out.println();
      System.out.printf("%d ", arr[i]);
    }
  }
}