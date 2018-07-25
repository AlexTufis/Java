package practica;

import java.io.File;
import java.io.FileOutputStream;
import java.io.StringWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Functions {
	protected ArrayList<Employee> list_employee = new ArrayList<Employee>();

	public void loadData() {
		try {
			/*Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/practicadatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false",
					"root", "admin");

			Statement myStmt = myConn.createStatement();

			ResultSet myRs = myStmt.executeQuery("select * from practicatable");*/
			
			ResultSet myRs=practica.DatabaseManagement.executeQuery("select * from practicatable");

			if (myRs != null) {
				while (myRs.next()) {
					Employee x = new Employee();
					x.setAll(myRs.getInt("id"), myRs.getString("name"), myRs.getString("role"), myRs.getInt("Age"));
					list_employee.add(x);
				}
			}
		} catch (Exception e) {
			System.out.println("Eroare1");
		}
	}

	public void createPDF(String inputFile, String outputFile) {
		int i;
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			com.itextpdf.text.Document document = new com.itextpdf.text.Document();
			PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(outputFile));
			writer.setPdfVersion(PdfWriter.VERSION_1_7);
			document.open();
			document.add(new Paragraph("Root element :" + doc.getDocumentElement().getNodeName()));
			NodeList nList = doc.getElementsByTagName("Employee");
			document.add(new Paragraph("----------------------------"));
			document.add(new Paragraph("\n"));
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				document.add(new Paragraph("Current Element :" + nNode.getNodeName()));
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					document.add(new Paragraph("ID : " + eElement.getElementsByTagName("id").item(0).getTextContent()));
					document.add(
							new Paragraph("Name : " + eElement.getElementsByTagName("name").item(0).getTextContent()));
					document.add(
							new Paragraph("Role : " + eElement.getElementsByTagName("role").item(0).getTextContent()));
					document.add(
							new Paragraph("Age : " + eElement.getElementsByTagName("Age").item(0).getTextContent()));
					document.add(new Paragraph("\n"));
				}
			}
			document.close();
		} catch (Exception e) {

		}
	}

	public void createXMLFrom(DatabaseManagement rs, String outputFile) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.newDocument();
			Element results = doc.createElement("Employees");
			doc.appendChild(results);

			Connection myConn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/practicadatabase?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false",
					"root", "admin");

			Statement myStmt = myConn.createStatement();

			ResultSet myRs = myStmt.executeQuery("select * from practicatable");

			ResultSetMetaData rsmd = myRs.getMetaData();
			int colCount = rsmd.getColumnCount();

			while (myRs.next()) {
				Element employee = doc.createElement("Employee");
				results.appendChild(employee);
				for (int i = 1; i <= colCount; i++) {
					String columnName = rsmd.getColumnName(i);
					Object value = myRs.getObject(i);
					Element node = doc.createElement(columnName);
					node.appendChild(doc.createTextNode(value.toString()));
					employee.appendChild(node);
				}
			}

			DOMSource domSource = new DOMSource(doc);
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer transformer = tf.newTransformer();
			transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			transformer.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			StringWriter sw = new StringWriter();
			StreamResult sr = new StreamResult(sw);
			Result result = new StreamResult(new File(outputFile));
			Source source = new DOMSource(doc);
			transformer.transform(source, result);
		} catch (Exception exc) {
			exc.printStackTrace();
		}

	}

}
