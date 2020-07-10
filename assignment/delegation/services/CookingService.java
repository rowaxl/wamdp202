package services;

public class CookingService {

	private String description;
	private String diets;
	private int dishes;

	public String getDescription() {
		return this.description;
	}
	public String getDiets() {
		return this.diets;
	}
	public int getDishes() {
		return this.dishes;
	}

	public CookingService(String description, String diets, int dishes) {
		this.description = description;
		this.diets = diets;
		this.dishes = dishes;
	}
}
