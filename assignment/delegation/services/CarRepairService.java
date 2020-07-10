package services;

public class CarRepairService {
  private String description;
  private String model;

  public CarRepairService(String description, String model) {
    this.description = description;
    this.model = model;
  }

  public String getDiscription() {
    return this.description;
  }
  public String getModel() {
    return this.model;
  }
}