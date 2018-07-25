package practica;

public class Employee {
	private int id;
	private String name;
	private String role;
	private int Age;

	public void setID(int value) {
		this.id = value;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public void setAll(int value, String value1, String value2, int value3) {
		this.id = value;
		this.name = value1;
		this.role = value2;
		this.Age = value3;
	}
}
