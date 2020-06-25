import java.util.Scanner;
import java.util.List;
import java.util.Random;

/**
 * RSP
 */
public class RSP {
  public enum Winner {
    User("USER"),
    Cp("CP"),
    Draw("DRAW");

    private String v;

    Winner(String val) {
      this.v = val;
    }

    public String toString() {
      return this.v;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String[] matches = { "Rock", "Scissor", "Papper" };
    Random randomGenerator = new Random();

    int userScore = 0;
    int cpScore = 0;

    while(Math.abs(userScore - cpScore) < 2) {
      System.out.println("Rock Scissor Paper![Rock:0, Scissor:1, Paper:2]:");
      int userInput = scanner.nextInt();
  
      List<List<Winner>> game = List.of(
        List.of(Winner.Draw, Winner.Cp, Winner.User),
        List.of(Winner.User, Winner.Draw, Winner.Cp),
        List.of(Winner.Cp, Winner.User, Winner.Draw)
      );
  
      int cpInput = (int) randomGenerator.nextInt(3);
      System.out.printf("CP: %s\n", matches[cpInput]);
  
  
      Winner res = game.get(cpInput).get(userInput);
  
      if (res == Winner.User) {
        System.out.println("User Win");
        userScore++;
      } else if (res == Winner.Cp) {
        System.out.println("CP Win");
        cpScore++;
      } else {
        System.out.println("Draw");
      }
    }

    scanner.close();

    System.out.printf("%s Wins", userScore > cpScore ? "User" : "CP");
  }
}