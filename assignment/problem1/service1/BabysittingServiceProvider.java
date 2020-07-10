package service1;

public class BabysittingServiceProvider extends Provider<BabysittingService> {
  public BabysittingServiceInterface delegate;

  @Override
  public void receiveService() {
    BabysittingService s = this.delegate.babysittingService();

    System.out.printf(
        "Babysitting service\nBaby is %d years old, and has allergies of %s\nDetails: %s\n",
        s.getAge(),
        s.getAllergies(),
        s.getDescription()
      );
  }
}