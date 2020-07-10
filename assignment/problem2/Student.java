/**
 * Student
 */
public class Student implements RowInterface {
  private String firstName;
  private String lastName;
  private int GPA;

  public Student(String firstName, String lastName, int GPA) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.GPA = GPA;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getGPA() {
    return GPA;
  }

  @Override
  public String format() {
    return String.format("%-14s| %-2d", this.getFirstName() + " " + this.getLastName(), this.getGPA());
  }
}