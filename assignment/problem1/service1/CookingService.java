package service1;

public class CookingService extends Service {
	private String diets;
	private int dishes;

	public CookingService(String description, String diets, int dishes) {
		super(description);
		this.diets = diets;
		this.dishes = dishes;
	}

	public String getDiets() {
		return this.diets;
	}
	public int getDishes() {
		return this.dishes;
	}
}
