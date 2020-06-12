import java.util.Scanner;

public class CalcSeconds {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the seconds you want to convert.");
    Integer seconds = s.nextInt();
    s.close();

    Integer hours = seconds / 3600;
    seconds %= 3600;

    Integer minutes = seconds / 60;
    seconds %= 60;

    System.out.printf("It's %d hours %d minutes %d seconds.", hours, minutes, seconds);
  }
}