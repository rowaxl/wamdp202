public class Temperture {
  public static void main(String[] args) {
    System.out.printf("%.1f °C -> %.1f°F\n", 20.0, Temp.convertToFahrenheit(20.0));
    System.out.printf("%.1f °F -> %.1f°C\n", 100.0, Temp.convertToCelsius(100.0));
  }
}