package practica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseManagement {
	private String myUrl = "jdbc:mysql://localhost:3306/practicadatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
	private static Statement myStmt;

	public void databaseManagement() {
		try {
			Connection myConn = DriverManager.getConnection(myUrl, "root", "admin");

			Statement myStmt = myConn.createStatement();

		} catch (Exception e) {
			System.out.println("Eroare2");
		}
	}

	public static ResultSet executeQuery(String query) {
		try {
			ResultSet myRs = myStmt.executeQuery("select * from practicatable");
			return myRs;
		} catch (Exception e) {
			System.out.println("Eroare3");
		}
		return null;
	}
}
