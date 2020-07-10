package service1;

public class CarRepairService extends Service {
  private String model;

  public CarRepairService(String description, String model) {
    super(description);
    this.model = model;
  }

  public String getModel() {
    return this.model;
  }
}