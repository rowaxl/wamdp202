public class ShowTable {
  public static void main(String[] args) {
    String q = args[0];
    switch (q) {
      case "1":
        showKgLbTable();
        break;

      case "2":
        showKmMilesTable();
        break;
    }
  }

  public static void showKgLbTable() {
    final double KG_TO_LBS = 2.2;

    System.out.println("Kilograms      Pounds  |  Pounds      Kilograms");
    int kg = 1;
    int lbs = 20;
    while (kg < 200) {
      System.out.printf("%-15d%6.1f  |  ", kg, (double) kg * KG_TO_LBS);

      System.out.printf("%-15d%6.2f\n", lbs, (double) lbs / KG_TO_LBS);
      kg += 2;
      lbs += 5;
    }
  }

  public static void showKmMilesTable() {
    final double MI_TO_KM = 1.609;

    System.out.println("Miles      Kilometers  |  Kilometers      Miles");
    int miles = 1;
    int kms = 20;
    while (miles <= 10) {
      System.out.printf("%-15d%6.3f  |  ", miles, (double) miles * MI_TO_KM);

      System.out.printf("%-15d%6.3f\n", kms, (double) kms / MI_TO_KM);
      miles += 1;
      kms += 5;
    }
  }
}
