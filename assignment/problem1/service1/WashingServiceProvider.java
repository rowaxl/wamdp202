package service1;

import service1.Provider;
import service1.WashingService;
import service1.WashingServiceInterface;

public class WashingServiceProvider extends Provider<WashingService> {
  WashingServiceInterface delegate;

  @Override
  public void receiveService() {
    WashingService s = this.delegate.washingService();

    System.out.printf("Prepare %s %d clothes to wash.\nDetails: %s\n", s.getClothColor(), s.getQuantity(), s.getDescription());
  }
}