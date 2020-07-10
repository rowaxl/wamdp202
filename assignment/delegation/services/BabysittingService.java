package services;

public class BabysittingService {

	private String description;
	private String allergies;
	private int age;

	public String getDescription() {
		return this.description;
	}
	public String getAllergies() {
		return this.allergies;
	}
	public int getAge() {
		return this.age;
	}

	public BabysittingService(String description, String allergies, int age) {
		this.description = description;
		this.allergies = allergies;
		this.age = age;
	}
}
