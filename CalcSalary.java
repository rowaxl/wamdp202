import java.util.Scanner;

/**
 * CalcSalary
 */
public class CalcSalary {
  static final int regularWorkingHour = 40;
  static final int overWorkedHour = 60;
  static final int minimumPayRate = 8;
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // ask payrate
    System.out.println("How much is your salary rate?");
    double payRate = scanner.nextDouble();

    if (payRate < minimumPayRate) {
      System.out.println("Your pay rate should be bigger than $8.00");
      scanner.close();
      return;
    }

    // ask worked hour
    System.out.println("How long did you worked in last week?");
    int workingHours = scanner.nextInt();

    scanner.close();

    if (workingHours > overWorkedHour) {
      System.out.println("You are not allowed to work more than 60 hours in a week.");
      return;
    }

    // calculate salary
    double salary = 0;
    if (workingHours > regularWorkingHour) {
      salary = payRate * regularWorkingHour + payRate * 1.5 * (workingHours - regularWorkingHour);
    } else {
      salary = payRate * workingHours;
    }

    System.out.printf("Salary: $%.2f", salary);
  }
}