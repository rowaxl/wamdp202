import java.util.List;
import java.util.stream.Collectors;

/**
 * View
 */
public class View {
  private List<StudentData> students;

  public void setStudents(List<StudentData> students) {
    this.students = students;
  }

  public List<StudentData> getStudents() {
    return this.students;
  }

  public static void main(String[] args) {
    View v = new View();

    StudentData s1 = new StudentData("Ali", "David", 80);
    StudentData s2 = new StudentData("Ana", "Leu", 82);
    StudentData s3 = new StudentData("Donald", "Trump", 81);
    StudentData s4 = new StudentData("Peter", "Jackson", 79);
    StudentData s5 = new StudentData("William", "Chen", 76);
    StudentData s6 = new StudentData("Bob", "Wes", 74);

    List<StudentData> students = List.of(s1, s2, s3, s4, s5, s6);
    v.setStudents(students);

    Table classA = new Table<StudentRow>("Classs Grade: A");

    List<StudentData> gradeAStudents = v.getStudents().stream().filter(student -> student.gpa >= 80).collect(Collectors.toList());
    List<StudentData> gradeBStudents = v.getStudents().stream().filter(student -> student.gpa < 80).collect(Collectors.toList());

    for (int i = 0; i < gradeAStudents.size(); i++) {
      StudentRow row = new StudentRow(String.valueOf(i), gradeAStudents.get(i));
      classA.rows.add(row);
    };
    classA.print();

    System.out.println();

    Table classB = new Table<StudentRow>("Class Grade: B");
    for (int i = 0; i < gradeBStudents.size(); i++) {
      StudentRow row = new StudentRow(String.valueOf(i), gradeBStudents.get(i));
      classB.rows.add(row);
    };
    classB.print();
  }
}