public class Main {
  static public void main(String args[]) {
    Watch rolex = new Watch();
    System.out.println(rolex.getTime());
    rolex.adjustTime();
    System.out.println("--------------");

    AppleWatch series5 = new AppleWatch();
    System.out.println(series5.getTime());
    System.out.println(series5.getTime("dd-MM HH:mm"));
    series5.adjustTime();
  }
}