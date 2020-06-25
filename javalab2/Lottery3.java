import java.util.Scanner;
import java.util.Arrays;
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

    List<Integer> lottery = List.of((int) (Math.random() * 9) + 1, (int) (Math.random() * 10),
        (int) (Math.random() * 10));

    int prize = 0;

    System.out.println("Lottery number is: " + lottery.toString().replace(", ", "").replaceAll("[\\[\\]]", ""));

    List<Integer> guess = Arrays.stream(input.split("")).map(e -> Integer.valueOf(e)).collect(Collectors.toList());

    if (lottery.equals(guess)) { // exact match
      prize = 1000000;
    } else if (checkMatchedDigit(lottery, guess) == lottery.size() + guess.size()) { // three digits matched
      prize = 30000;
    } else if (
      checkMatchedDigit(lottery, guess) < lottery.size() + guess.size()
      && checkMatchedDigit(lottery, guess) > 0) { // 1 ~ 2 digits matched
        prize = 10000;
    }

    DecimalFormat formatter = new DecimalFormat("###,###");

    System.out.println(prize == 0 ? "No matching number founds" : String.format("You wins $%s!", formatter.format(prize)));
  }

  public static int checkMatchedDigit(List<Integer> target, List<Integer> compare) {
    int matched = 0;
    for (Integer i : compare) {
      matched += target.contains(i) ? 1 : 0;
    }
    for (Integer i : target) {
      matched += compare.contains(i) ? 1 : 0;
    }

    return matched;
  }
}