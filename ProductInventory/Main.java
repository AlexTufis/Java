package sumOfProducts;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Main {
//	public static void main(String args[]) {
//		ProductInventory p1 = new ProductInventory(1, 10.50, 4);
//		ProductInventory p2 = new ProductInventory(2, 3.5, 3 );
//		
//		Inventory inv = new Inventory();
//		inv.addProduct(p1);
//		inv.addProduct(p2);
//		
//		inv.printInventory();
//	}
	
	public static void main(String[] args) {
		ButtonFrame frm = new ButtonFrame("Product Inventory");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frm.setSize(580, 320);
		frm.setResizable(false);
		frm.setLocation(dim.width / 2 - frm.getSize().width / 2, dim.height / 2 - frm.getSize().height / 2);
		frm.setVisible(true);

	}
}
