package domain;

public abstract class Employee {
	/*  Excercise 1*/
	public String ID;
	public String name;
	public String phone;
	public double salry;
	public double hoursWorked;
	
	public Employee(String iD, String name, String phone, double salry, double hoursWorked) {
		super();
		ID = iD;
		this.name = name;
		this.phone = phone;
		this.salry = salry;
		this.hoursWorked = hoursWorked;
	}
	
	public Employee() {
		super();
		ID = " ";
		this.name = " ";
		this.phone = " ";
		this.salry = 0.0;
		this.hoursWorked = 0.0;
	}
	

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public double getSalry() {
		return salry;
	}

	public void setSalry(double salry) {
		this.salry = salry;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	} 

	@Override
	public String toString() {
		return "Employee [ID=" + ID + ", name=" + name + ", phone=" + phone + ", salry=" + salry + ", hoursWorked="
				+ hoursWorked + "]";
	}

	
	
	public abstract  double CalculatePay();
	

}
