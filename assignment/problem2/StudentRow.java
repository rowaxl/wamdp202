import java.util.List;

/**
 * StudentRow
 */
public class StudentRow implements TableRowInterface<StudentData> {
  private String id;
  private StudentData data;

  public StudentRow(String id, StudentData studentData) {
    this.id = id;
    this.data = studentData;
  }

  public StudentData getData() {
    return data;
  }

  @Override
  public String format() {
    return String.format("%-2s | %-10s | %-10s | %-2d", this.id, this.data.firstName, this.data.lastName, this.data.gpa);
  }
}