import service1.WashingServiceProvider;
import service1.*;

public class ApplicationDriver {
  public static void main(String[] args) {
    Client c1 = new Client();

    BabysittingServiceProvider babysitter1 = new BabysittingServiceProvider();
    c1.setBabyAge(3);
    c1.setBabyAllergy("Eggs");
    c1.setBabysittingDescription("Don't sleep very well.");
    c1.setBabysittingServiceProvider(babysitter1);
    babysitter1.receiveService();

    System.out.println();

    CarRepairServiceProvider carRepairServiceProvider = new CarRepairServiceProvider();
    c1.setCarRepairDescription("Engine doesn't ignite");
    c1.setCarModel("Chevrolet Camaro");
    c1.setCarRepairServiceProvider(carRepairServiceProvider);
    carRepairServiceProvider.receiveService();

    System.out.println();

    CookingServiceProvider cookingServiceProvider = new CookingServiceProvider();
    c1.setCookingDescription("Couple meals for whole family");
    c1.setCookingDiet("Vegan diet");
    c1.setCookingDishs(5);
    c1.setCookingServiceProvider(cookingServiceProvider);
    cookingServiceProvider.receiveService();

    System.out.println();
    StudentServiceProvider studentServiceProvider = new StudentServiceProvider();
    c1.setStudentServiceDescription("Print GPA");
    c1.setStudentServiceApplication("GPA_2021_q1.pdf");
    c1.setStudentServiceType("Paper");
    c1.setStudentServiceProvider(studentServiceProvider);
    studentServiceProvider.receiveService();

    System.out.println();
    WashingServiceProvider washingServiceProvider = new WashingServiceProvider();
    c1.setWashingClothColor("Black");
    c1.setWashingDescription("Do not dry too long");
    c1.setWashingQuantity(20);
    c1.setWashingServiceProvider(washingServiceProvider);
    washingServiceProvider.receiveService();
  }
}
