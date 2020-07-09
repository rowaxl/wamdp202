import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

public class ZeroIndexArray {
  private List<Integer> items;
  public ZeroIndexArray(List<Integer> items) {
    this.items = items;
  }
  public List<Integer> preIndex(int index) {
    if (index < 0 || index > this.items.size() - 1) {
      return new ArrayList<Integer>();
    }
    return this.items.subList(0, index + 1);
  }

  public List<Integer> postIndex(int index) {
    if (index < 0 || index > this.items.size() - 1) {
      return new ArrayList<Integer>();
    }
    return this.items.subList(index + 1, this.items.size());
  }

  public Integer maxArray(List<Integer> array) {
    return Collections.max(array);
  }

  public Integer difference(int index) {
    List<Integer> preIndexArray = this.preIndex(index);
    System.out.println(preIndexArray);
    Integer preMax = this.maxArray(preIndexArray);
    System.out.println(preMax);

    List<Integer> postIndexArray = this.postIndex(index);
    System.out.println(postIndexArray);
    Integer postMax = this.maxArray(postIndexArray);
    System.out.println(postMax);

    Integer difference = Math.abs(preMax - postMax);
    return difference;
  }

  public int findIndexForMaximumDifference() {
    List<Integer> differences = new ArrayList<Integer>();
    for (int i = 0; i < this.items.size() - 1; i++) {
      differences.add(this.difference(i));
    }

    return Collections.max(differences);
  }
  
  public static void main(String[] args) {
    List<Integer> a = new ArrayList<Integer>(List.of(4, 5, 2, 8, -1, -4, 9));
    ZeroIndexArray z = new ZeroIndexArray(a);
    System.out.printf("Max d = %d", z.findIndexForMaximumDifference());
  }
}