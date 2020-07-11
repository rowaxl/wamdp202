import java.util.List;
// import java.util.ArrayList;
/**
 * Table
 */
public class Table<T extends TableRowInterface> {
  public List<T> rows;
  private String title;

  public Table(String title) {
    // this.rows = new ArrayList<T>();
    this.title = title;
  }

  public void print() {
    System.out.println(this.title);

    int length = 0;
    for (T row : rows) {
      if (length == 0) {
        length = row.format().length() + 3;
      }

      System.out.println("-".repeat(length));
      System.out.println("| " + row.format() + " |");
    }

    System.out.println("-".repeat(length));
  }
}