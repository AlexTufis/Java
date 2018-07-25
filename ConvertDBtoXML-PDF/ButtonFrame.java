package practica;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

public class ButtonFrame extends JFrame implements ActionListener {
	JButton b1;
	JButton b2;

	Functions emp = new Functions();
	JPanel pMeasure = new JPanel();

	ButtonFrame(String title) {
		super(title);
		setLayout(new FlowLayout());
		JLabel l1 = new JLabel("Choose how you save the file");

		b1 = new JButton("to xml");
		b1.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				b1ActionPerformed(evt);
			}
		});

		b2 = new JButton("xml to pdf");
		b2.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(ActionEvent evt) {
				b2ActionPerformed(evt);
			}
		});

		emp.loadData();

		add(l1);
		add(b1);
		add(b2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	DatabaseManagement rs = new DatabaseManagement();

	private void b1ActionPerformed(ActionEvent evt) {
		emp.createXMLFrom(rs, "zAngajati.xml");
	}

	private void b2ActionPerformed(ActionEvent evt) {
		emp.createPDF("zAngajati.xml", "pAngajati.pdf");
	}

	public void actionPerformed(ActionEvent e) {
		throw new UnsupportedOperationException("Not supported yet.");

	}
}