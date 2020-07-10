package service1;

public class BabysittingService extends Service {
	private String allergies;
	private int age;

	public String getAllergies() {
		return this.allergies;
	}
	public int getAge() {
		return this.age;
	}

	public BabysittingService(String description, String allergies, int age) {
		super(description);
		this.allergies = allergies;
		this.age = age;
	}
}
