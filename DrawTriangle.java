import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DrawTriangle {
  public static void main(String[] args) {
    for (int i = 10; i > 0; i--) {
      System.out.println(
          Arrays.stream(IntStream.range(0, i).toArray())    // make int[] = { 0 ... i }
            .mapToObj(intValue -> String.valueOf(intValue)) // cast int elements to String
            .collect(Collectors.joining(" "))               // String.join(" ") operation
      );
    }
  }
}