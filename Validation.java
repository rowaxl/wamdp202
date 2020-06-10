import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Validation {
  static boolean validate(String password) {
    if (password.length() < 8) {
      return false;
    }

    if (!password.matches("^[a-zA-Z0-9]*$")) {
      return false;
    }

    Pattern digitPattern = Pattern.compile("\\d");
    Matcher matcher = digitPattern.matcher(password);

    int digitCount = 0;
    while (matcher.find()) {
      digitCount++;
    }

    // for (int i = 0; i < password.length(); i++) {
    //   if (String.valueOf(password.charAt(i)).matches("[0-9]")) {
    //     digitCount++;
    //   }
    // }
    if (digitCount < 2) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the password for validation: ");
    String password = scanner.nextLine();

    scanner.close();

    if (validate(password)) {
      System.out.printf("Password is valid: %s\n", password);
    } else {
      System.out.printf("Password is invalid: %s\n", password);
    }
  }
}