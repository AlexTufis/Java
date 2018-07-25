package practica;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static DatabaseManagement db = new DatabaseManagement();

	public static void main(String[] args) {
		ButtonFrame frm = new ButtonFrame("Convert file to XML,PDF from DB by AlexTufis");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		frm.setSize(380, 220);
		frm.setResizable(false);
		frm.setLocation(dim.width / 2 - frm.getSize().width / 2, dim.height / 2 - frm.getSize().height / 2);
		frm.setVisible(true);

	}
}
