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
    StudentData s2 = new StudentData("Peter", "Jackson", 79);
    StudentData s3 = new StudentData("William", "Chen", 76);
    StudentData s4 = new StudentData("Donald", "Trump", 81);
    StudentData s5 = new StudentData("Bob", "Wes", 74);
    StudentData s6 = new StudentData("Ana", "Leu", 82);

    List<StudentData> students = List.of(s1, s2, s3, s4, s5, s6);
    v.setStudents(students);
    
    List<StudentRow> wholeStudents = v.getStudents().stream()
        .map((StudentData data) -> new StudentRow(data))
        .collect(Collectors.toList());

    List<StudentRow> gradeAStudents = v.getStudents().stream()
        .filter(student -> student.gpa >= 80)
        .map((StudentData data) -> new StudentRow(data))
        .collect(Collectors.toList());

    List<StudentRow> gradeBStudents = v.getStudents().stream()
        .filter(student -> student.gpa < 80)
        .map((StudentData data) -> new StudentRow(data))
        .collect(Collectors.toList());

    Table classA = new Table<StudentRow>("Classs Grade: A");
    classA.rows = gradeAStudents;
    classA.print();

    System.out.println();

    Table classB = new Table<StudentRow>("Class Grade: B");
    classB.rows = gradeBStudents;
    classB.print();

    System.out.println();

    Table school = new Table<StudentRow>("School");
    school.rows = wholeStudents;
    school.print();
  }
}