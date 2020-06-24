import java.util.Scanner;

public class ShowPyramid {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the height: ");
    int height = scanner.nextInt();
    scanner.close();

    for (int i = 1; i <= height; i++) {
      for (int j = 1; j < height * 2; j++) {
        if (j < height) {
          if (i > height - j) {
            System.out.printf("%d ", height - j + 1);
          } else if (height - j > 8) {
            System.out.print("   ");
          } else {
            System.out.print("  ");
          }
        }
        if (j == height)
          System.out.print("1");
        
        if (j > height) {
          if (i > j - height)
            System.out.printf(" %d", j - height + 1);
        }
      }
      System.out.println();
    }
  }
}
