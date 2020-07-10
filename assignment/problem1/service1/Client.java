package service1;

public class Client implements 
    BabysittingServiceInterface,
    CarRepairServiceInterface,
    CookingServiceInterface,
    StudentServiceInterface,
    WashingServiceInterface
{
  private int babyAge;
  private String babyAllergy;
  private String babysittingDescription;

  private String carRepairDescription;
  private String carModel;

  private String cookingDescription;
  private String cookingDiet;
  private int cookingDishs;

  private String studentServiceDescription;
  private String studentServiceType;
  private String studentServiceApplication;

  private String washingDescription;
  private String washingClothColor;
	private int washingQuantity;

  private BabysittingServiceProvider babysittingServiceProvider;
  private CarRepairServiceProvider carRepairServiceProvider;
  private CookingServiceProvider cookingServiceProvider;
  private StudentServiceProvider studentServiceProvider;
  private WashingServiceProvider washingServiceProvider;

  public void setBabyAge(int babyAge) {
    this.babyAge = babyAge;
  }

  public void setBabyAllergy(String babyAllergy) {
    this.babyAllergy = babyAllergy;
  }

  public void setBabysittingDescription(String babysittingDescription) {
    this.babysittingDescription = babysittingDescription;
  }

  public void setCarModel(String carModel) {
    this.carModel = carModel;
  }

  public void setCarRepairDescription(String carRepairDescription) {
    this.carRepairDescription = carRepairDescription;
  }

  public void setCookingDescription(String cookingDescription) {
    this.cookingDescription = cookingDescription;
  }

  public void setCookingDiet(String cookingDiet) {
    this.cookingDiet = cookingDiet;
  }

  public void setCookingDishs(int cookingDishs) {
    this.cookingDishs = cookingDishs;
  }

  public void setStudentServiceApplication(String studentServiceApplication) {
    this.studentServiceApplication = studentServiceApplication;
  }

  public void setStudentServiceDescription(String studentServiceDescription) {
    this.studentServiceDescription = studentServiceDescription;
  }

  public void setStudentServiceType(String studentServiceType) {
    this.studentServiceType = studentServiceType;
  }

  public void setWashingClothColor(String washingClothColor) {
    this.washingClothColor = washingClothColor;
  }

  public void setWashingDescription(String washingDescription) {
    this.washingDescription = washingDescription;
  }

  public void setWashingQuantity(int washingQuantity) {
    this.washingQuantity = washingQuantity;
  }

  // service providers
  public void setBabysittingServiceProvider(BabysittingServiceProvider babysittingServiceProvider) {
    this.babysittingServiceProvider = babysittingServiceProvider;
    this.babysittingServiceProvider.delegate = this;
  }

  public void setCookingServiceProvider(CookingServiceProvider cookingServiceProvider) {
    this.cookingServiceProvider = cookingServiceProvider;
    this.cookingServiceProvider.delegate = this;
  }

  public void setStudentServiceProvider(StudentServiceProvider studentServiceProvider) {
    this.studentServiceProvider = studentServiceProvider;
    this.studentServiceProvider.delegate = this;
  }

  public void setWashingServiceProvider(WashingServiceProvider washingServiceProvider) {
    this.washingServiceProvider = washingServiceProvider;
    this.washingServiceProvider.delegate = this;
  }

  @Override
  public BabysittingService babysittingService() {
    BabysittingService b = new BabysittingService(this.babysittingDescription, this.babyAllergy, this.babyAge);
    return b;
  }

  public void setCarRepairServiceProvider(CarRepairServiceProvider carRepairServiceProvider) {
    this.carRepairServiceProvider = carRepairServiceProvider;
    this.carRepairServiceProvider.delegate = this;
  }

  @Override
  public CarRepairService carRepairService() {
    return new CarRepairService(this.carRepairDescription, this.carModel);
  }

  @Override
  public CookingService cookingService() {
    return new CookingService(this.cookingDescription, this.cookingDiet, this.cookingDishs);
  }

  @Override
  public StudentService studentService() {
    return new StudentService(this.studentServiceDescription, this.studentServiceType, this.studentServiceApplication);
  }

  @Override
  public WashingService washingService() {
    return new WashingService(this.washingDescription, this.washingClothColor, this.washingQuantity);
  }
}