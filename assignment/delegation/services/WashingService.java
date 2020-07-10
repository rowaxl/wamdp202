package services;

public class WashingService {

	private String description;
	private String clothColor;
	private int quantity;

	public String getDescription() {
		return this.description;
	}
	public String getClothColor() {
		return this.clothColor;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public WashingService(String description, String clothColor, int quantity) {
		this.description = description;
		this.clothColor = clothColor;
		this.quantity = quantity;
	}
}
