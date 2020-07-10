package services;

import services.ServiceProtocolInterface;

public class CarRepairServiceProvider {
  public CarReipairServiceProtocolInterface delegate;

  public void receiveService() {
    CarRepairService s = this.delegate.carRepairService();

    String description = s.getDiscription();
    String model = s.getModel();

    System.out.printf("%s have to be repaired: %s\n", model, description);
  }
}