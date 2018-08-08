package sumOfProducts;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.text.View;

public class ButtonFrame extends JFrame implements ActionListener{
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	ProductInventory i1 = new ProductInventory(1, 10.50, 1);
	ProductInventory i2 = new ProductInventory(2, 3.5, 1);
	Inventory inv = new Inventory();
	
	ButtonFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
	b1 = new JButton("Add 1 kg apples/10.50$");
	b1.addActionListener(new java.awt.event.ActionListener() {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			inv.addProduct(i1);
		}
		
	});
	
	b2 = new JButton("Add 1 kg oranges/3.50$");
	b2.addActionListener(new java.awt.event.ActionListener() {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
				inv.addProduct(i2);
		}
		
	});
		
	b3 = new JButton("Print how much it costs");
	b3.addActionListener(new java.awt.event.ActionListener() {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			inv.printInventory();
		}
	});
	
	b4 = new JButton("Reset");
	b4.addActionListener(new java.awt.event.ActionListener() {

		@Override
		public void actionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub
			System.exit(1);
		}
		
	});
	
	
	add(b1);
	add(b2);
	add(b3);
	add(b4);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
