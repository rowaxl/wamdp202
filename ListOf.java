import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ListOf {
  public static void main(String[] args) {
    List lst = List.of(1,2,3,4,5);
    System.out.println(lst.toString());

    ArrayList als = new ArrayList();
    als.addAll(lst);

    System.out.println(als.toString());
  }
}