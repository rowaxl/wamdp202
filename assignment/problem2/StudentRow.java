import java.util.List;

/**
 * StudentRow
 */
public class StudentRow implements TableRowInterface<StudentData> {
  private StudentData data;

  public StudentRow(StudentData studentData) {
    this.data = studentData;
  }

  public StudentData getData() {
    return data;
  }

  @Override
  public String format() {
    return String.format("%-10s | %-10s | %-2d", this.data.firstName, this.data.lastName, this.data.gpa);
  }
}