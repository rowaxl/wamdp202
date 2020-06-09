import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordCheck {
  final static String PASSWORD_PATTERN = "^Ilove123$";
  final static int MAX_MISMATCHED = 3;
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int matchCount = 0;
    while (matchCount < MAX_MISMATCHED) {
      System.out.println("Enter the password:");
      String userInput = scanner.nextLine();

      if (Pattern.matches(PASSWORD_PATTERN, userInput)) {
        System.out.println("Success to login");
        break;
      }

      System.out.println("Invalid password");
      matchCount++;
    }

    scanner.close();
    if (matchCount >= MAX_MISMATCHED) {
      System.out.println("Your account locked");
    }
  }
}