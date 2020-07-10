package services;

public class HomeServiceProvider {
  public HomeServicesInterface delegate; // client

  public void receiveCookingService() {
    CookingService s = this.delegate.cookingService();
    String description = s.getDescription();
    String diets = s.getDiets();
    int dishes = s.getDishes();

    System.out.printf("Prepare %d dishes of %s.\nDetails: %s\n", dishes, diets, description);
  }

  public void receiveWashingService() {
    WashingService s = this.delegate.washingService();
    String description = s.getDescription();
    String clothColor = s.getClothColor();
    int quantity = s.getQuantity();

    System.out.printf("Prepare %s %d clothes to wash.\nDetails: %s\n", clothColor, quantity, description);
  }

  public void receiveBabySittingService() {
    BabysittingService s = this.delegate.babysittingService();
    String description = s.getDescription();
    String allergies = s.getAllergies();
    int age = s.getAge();

    System.out.printf("Babysitting for %d year old baby. He/She has allergies for %s.\nDetails: %s\n", age, allergies, description);
  }
}