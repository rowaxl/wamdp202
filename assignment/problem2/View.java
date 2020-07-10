import java.util.ArrayList;

/**
 * View
 */
public class View {
  private ArrayList<Student> students;

  public View() {
    this.students = new ArrayList<Student>();
  }

  public void addStutent(Student student) {
    this.students.add(student);
  }

  public ArrayList<Student> getStudents() {
    return this.students;
  }

  public static void main(String[] args) {
    View v = new View();

    v.addStutent(new Student("Ali", "David", 80));
    v.addStutent(new Student("Ana", "Leu", 82));
    v.addStutent(new Student("Donald", "Trump", 81));
    v.addStutent(new Student("Peter", "Jackson", 79));
    v.addStutent(new Student("William", "Chen", 76));

    Table t1 = new Table<Student>("Grade: A");
    t1.delegate = v.getStudents().subList(0, 3);
    t1.print();

    Table t2 = new Table<Student>("Grade: B");
    t2.delegate = v.getStudents().subList(3, 5);
    t2.print();
  }
}