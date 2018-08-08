package sumOfProducts;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
	private List<ProductInventory> products;
	
	public Inventory() {
		products = new ArrayList<ProductInventory>();
	}
	
	public void addProduct(ProductInventory p) {
		products.add(p);
	}
	
	public void printInventory() {
		double sum = 0;
		for(ProductInventory p : products) {
			System.out.println(p.toString());
			sum += p.getPrice()*p.getKg();
		}
		System.out.println("Sum is: " + sum);
	}
}
