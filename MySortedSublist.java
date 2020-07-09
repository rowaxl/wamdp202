import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Collections;

public class MySortedSublist {
  public static HashMap<Integer, ArrayList<ArrayList<Integer>>> findAllSortedSublists(ArrayList<Integer> originalList,
      boolean isASC) {
    HashMap<Integer, ArrayList<ArrayList<Integer>>> result = new HashMap<Integer, ArrayList<ArrayList<Integer>>>();

    int index = 0;

    // loop through the index
    while (index < originalList.size()) {

      // loop the size
      for (int size = 1; size <= originalList.size() - index; size++) {
        ArrayList<Integer> subArray = new ArrayList<Integer>(originalList.subList(index, index + size));
        if (isSorted(subArray, isASC)) {
          if (result.get(size) == null) {
            ArrayList<ArrayList<Integer>> newArr = new ArrayList<ArrayList<Integer>>();
            newArr.add(subArray);
            result.put(size, newArr);
          } else {
            result.get(size).add(subArray);
          }
        } else {
          break;
        }
      }

      index++;
    }

    return result;
  }

  public static boolean isSorted(ArrayList<Integer> arr, boolean isASC) {
    boolean isSorted = true;

    if (isASC) {
      for (int i = 1; i < arr.size(); i++) {
        isSorted = isSorted && (arr.get(i) >= arr.get(i - 1));
      }
    } else {
      for (int i = 1; i < arr.size(); i++) {
        isSorted = isSorted && (arr.get(i) <= arr.get(i - 1));
      }
    }

    return isSorted;
  }

  public static ArrayList<ArrayList<Integer>> findTheLongestSortedSublist(ArrayList<Integer> originalList,
      boolean isASC) {
    HashMap<Integer, ArrayList<ArrayList<Integer>>> sortedLists = MySortedSublist.findAllSortedSublists(originalList,
        isASC);
    int maxSize = Collections.max(sortedLists.keySet());

    return sortedLists.get(maxSize);
  }
  
  public static void printList(HashMap<Integer, ArrayList<ArrayList<Integer>>> sortedLists) {
    for (Integer size : sortedLists.keySet()) {
      System.out.printf("Size %d: %s\n", size, sortedLists.get(size).toString());
    }
  }

  public static void main(String[] args) {
    ArrayList<Integer> originalList = new ArrayList<Integer>(Arrays.asList(3, 5, 6, -1, 7, 4, 3, 10, 1, 2, 2, 4, 6));

    System.out.println("ascend sorted lists");
    MySortedSublist.printList(MySortedSublist.findAllSortedSublists(originalList, true));

    System.out.println(MySortedSublist.findTheLongestSortedSublist(originalList, true));

    System.out.println("----------------------");
    System.out.println("descend sorted lists");

    MySortedSublist.printList(MySortedSublist.findAllSortedSublists(originalList, false));

    System.out.println(MySortedSublist.findTheLongestSortedSublist(originalList, false));
  }
}