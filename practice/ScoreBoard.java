import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

class ScoreBoard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number of studens: ");
    int length = scanner.nextInt();

    TreeMap<Student, String> scoreBoard = new TreeMap<Student, String>(new StudentComp());
    System.out.println("Enter a name of student and score");

    while (scoreBoard.size() < length) {
      System.out.printf("Student(%d) Name: ", scoreBoard.size() + 1);
      String name = scanner.next();

      System.out.printf("Student(%d) Score: ",  scoreBoard.size() + 1);
      Integer score = scanner.nextInt();

      scoreBoard.put(new Student(name, score), name);
      System.out.println("");
    }
    scanner.close();

    // TreeMap always sorted by comparator
    List<Student> studentList = new ArrayList<Student>(scoreBoard.keySet());
    System.out.printf("Highest scored student is: %s (%d)\n", studentList.get(0).getName(), studentList.get(0).getScore());
    System.out.printf("Second highest scored student is: %s (%d)\n", studentList.get(1).getName(), studentList.get(1).getScore());
  }

  static class StudentComp implements Comparator<Student> {
    @Override
    public int compare(Student e1, Student e2) {
      return e1.getScore() < e2.getScore() ? 1 : -1;
    }
  }

  static class Student {
    private String name;
    private Integer score;

    public Student(String name, Integer score) {
      setName(name);
      setScore(score);
    }

    public String getName() {
      return name;
    }

    public Integer getScore() {
      return score;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setScore(Integer score) {
      this.score = score;
    }
  }
}
