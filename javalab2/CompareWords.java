import java.util.Scanner;

public class CompareWords {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first word you want to comparing:");
    String firstWord = scanner.nextLine();
    System.out.println("Enter the second word you want to comparing:");
    String secondWord = scanner.nextLine();

    scanner.close();

    int compareResult = firstWord.toLowerCase().compareTo(secondWord.toLowerCase());
    if (compareResult == 0) {
      System.out.println("Those are same words");
    } else if (compareResult < 0) {
      System.out.printf("\"%s\" goes before \"%s\"\n", firstWord, secondWord);
    } else {
      System.out.printf("\"%s\" goes before \"%s\"\n", secondWord, firstWord);
    }
  }
}