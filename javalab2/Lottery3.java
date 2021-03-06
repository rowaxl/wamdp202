import java.util.Scanner;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.text.DecimalFormat;


public class Lottery3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a three digit number: ");
    String input = scanner.nextLine();
    scanner.close();

    if (input.length() < 3 || input.length() > 3) {
      System.out.println("You should enter a three digit number.");
      System.exit(1);
    }

    if (!input.matches("^[0-9]{3}$")) {
      System.out.println("You should use only numbers.");
      System.exit(1);
    }

    if (checkStringDuplicate(input)) {
      System.out.println("You should use only unique numbers.");
      System.exit(1);
    }

    List<Integer> lottery = new ArrayList<Integer>();

    while (lottery.size() < 3) {
      if (lottery.size() == 0) {
        lottery.add((int) (Math.random() * 9) + 1);
      } else {
        int randomNum = (int) (Math.random() * 10);

        if (!lottery.contains(randomNum)) {
          lottery.add(randomNum);
        }
      }
    }

    int prize = 0;

    System.out.println("Lottery number is: " + lottery.toString().replace(", ", "").replaceAll("[\\[\\]]", ""));

    List<Integer> guess = Arrays.stream(input.split("")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());

    int matched = checkMatchedDigit(lottery, guess);

    if (matched == 6) {
      System.out.println("No matching numbers!");
      System.exit(0);
    }

    if (lottery.equals(guess)) { // exact match
      prize = 1000000;
    } else if (matched == lottery.size()) { // three digits matched
      prize = 30000;
    } else if (matched > lottery.size()) { // 1 ~ 2 digits matched
      prize = 10000;
    }

    DecimalFormat formatter = new DecimalFormat("###,###");

    System.out.printf("You wins $%s!\n", formatter.format(prize));
  }

  public static int checkMatchedDigit(List<Integer> target, List<Integer> compare) {
    Set<Integer> set = new HashSet<Integer>(target);
    set.addAll(compare);

    return set.size();
  }

  public static boolean checkStringDuplicate(CharSequence g) {
    for (int i = 0; i < g.length(); i++) {
        for (int j = i + 1; j < g.length(); j++) {
            if (g.charAt(i) == g.charAt(j)) {
                return true;
            }
        }
    }
    return false;
}
}