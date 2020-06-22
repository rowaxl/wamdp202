import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class ScoreBoard {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number of studens: ");
    int length = scanner.nextInt();

    TreeMap<Student, String> scoreBoard = new TreeMap<Student, String>(new StudentComp());
    while (scoreBoard.size() < length) {
      System.out.println("Enter a name of student and score:");
      String name = scanner.next();
      Integer score = scanner.nextInt();
      scoreBoard.put(new Student(name, score), name);
    }

    scanner.close();
    Student highestScored = scoreBoard.firstEntry().getKey();
    System.out.printf("Highest scored(%d) student is: %s\n", highestScored.getScore(), highestScored.getName());
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
