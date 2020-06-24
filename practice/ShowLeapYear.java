import java.util.List;
import java.util.ArrayList;

public class ShowLeapYear {
  public static void main(String[] args) {
    final int start = 101;
    final int end = 2100;

    int year = start;
    List<Integer> leapYears = new ArrayList<Integer>();
    while (year < end) {
      if (year % 4 == 0) {
        if (year % 100 != 0) {
          leapYears.add(year);
        } else if (year % 400 == 0) {
          leapYears.add(year);
        }
      }
      year++;
    }

    for (int i = 0; i < leapYears.size(); i++) {
      if (i % 10 == 0)
        System.out.println();
      System.out.printf("%d ", leapYears.get(i));
    }

    System.out.println();
    System.out.printf("number of leap years: %d\n", leapYears.size());
  }
}