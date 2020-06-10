public class Car {
  public String model;
  public int maxSpeed;

  static int count = 0;

  public void drive() {
    System.out.printf("%s can drive %d kms/h\n", model, maxSpeed);
  }

  public static int countCars() {
    return count;
  }

  public static void main(String[] args) {
    Car lamborghini = new Car();

    lamborghini.model = "Huracan";
    lamborghini.maxSpeed = 300;
    Car.count++; // Car.count be 1

    Car ferrari = new Car();
    ferrari.model = "LaFerrari";
    ferrari.maxSpeed = 290;
    Car.count++; // Car.count be 2

    lamborghini.drive();
    ferrari.drive();

    System.out.printf("%d car instances created.", Car.countCars()); // Car.count = 2;
  }
}