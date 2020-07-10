package service1;

import service1.CookingService;
import service1.CookingServiceInterface;
import service1.Provider;

public class CookingServiceProvider extends Provider<CookingService> {
  CookingServiceInterface delegate;

  @Override
  public void receiveService() {
    CookingService s = this.delegate.cookingService();

    System.out.printf("Prepare %d dishes of %s.\nDetails: %s\n", s.getDishes(), s.getDiets(), s.getDescription());
  }
}