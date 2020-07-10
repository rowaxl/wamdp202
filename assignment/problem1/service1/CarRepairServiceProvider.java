package service1;

public class CarRepairServiceProvider extends Provider<CarRepairService> {
  CarRepairServiceInterface delegate;

  @Override
  public void receiveService() {
    CarRepairService s = this.delegate.carRepairService();

    System.out.printf("Start repairing %s\nDetail: %s\n", s.getModel(), s.getDescription());
  }
}