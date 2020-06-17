public class Temp {
  static public double convertToFahrenheit(double celsius) {
    return celsius * 1.8 + 32;
  }

  static public double convertToCelsius(double farenheit) {
    return (farenheit - 32) / 1.8;
  }
}