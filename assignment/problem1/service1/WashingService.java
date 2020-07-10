package service1;

public class WashingService extends Service {
	private String clothColor;
	private int quantity;

	public String getClothColor() {
		return this.clothColor;
	}
	public int getQuantity() {
		return this.quantity;
	}

	public WashingService(String description, String clothColor, int quantity) {
		super(description);
		this.clothColor = clothColor;
		this.quantity = quantity;
	}
}
