import java.util.List;

/**
 * Table
 */
public class Table<T extends RowInterface> {
  public List<T> delegate;
  private String title;

  public Table(String title) {
    this.title = title;
  }

  public void print() {
    System.out.println(this.title);
    for (RowInterface row : delegate) {
      System.out.println("--------------------");
      System.out.println("| " + row.format() + "|");
    }

    System.out.println("--------------------");
  }
}