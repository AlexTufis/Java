package sumOfProducts;

public class ProductInventory {
	private double price;
	private int id;
	private double kg;
	
	public ProductInventory(int id,double price,double kg) {
		this.id = id;
		this.price = price;
		this.kg = kg;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getKg() {
		return kg;
	}
	public void setKg(double kg) {
		this.kg = kg;
	}
	@Override
	public String toString() {
		return String.format("%d , %.2f , %.2f", id,price,kg);
	}
	
	
}
