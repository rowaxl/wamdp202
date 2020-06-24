import java.util.List;
import java.util.ArrayList;

public class Divisable {
  public static void main(String[] args) {
    Integer start = 100;
    final Integer end = 1000;
    final Integer gdp = 5 * 6;

    List<Integer> list = new ArrayList<Integer>();

    while (start < end) {
      for (int i = start; i < end; i++) {
        if (i % gdp == 0) {
          start = i;
          break;
        }
      }

      list.add(Integer.valueOf(start));
      start += gdp;
    }

    for (int j = 0; j < list.size(); j++) {
      if (j > 0 && j % 10 == 0) 
        System.out.println("");
      System.out.printf("%d ", list.get(j));
    }
  }
}