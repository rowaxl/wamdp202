import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FindIndex {
  static int binarySearch(int[] array, int left, int right, int target) {
    int middle = left + (right - 1) / 2;

    if (array[middle] == target) {
      return middle;
    } else if (array[middle] > target) {
      // search left side
      return binarySearch(array, left, middle - 1, target);
    } else if (array[middle] < target) {
      // search right side
      return binarySearch(array, middle, right, target);
    }

    // not found
    return -1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a Length of array:");
    int length = scanner.nextInt();

    int[] numbers = new int[length];

    for (int i = 0; i < length; i++) {
      System.out.printf("Enter a Number for element of array[%d]:", i);
      numbers[i] = scanner.nextInt();
    }

    System.out.println("Enter the target: ");
    int target = scanner.nextInt();
    scanner.close();

    int index = binarySearch(numbers, 0, length, target);

    if (index == -1) {
      System.out.println("Target not found");
      return;
    }

    System.out.printf("Target %d's index is: %d\n", target, index);
  }
}