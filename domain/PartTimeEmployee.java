package domain;

public class PartTimeEmployee extends Employee implements Payable {
	private final double BASICPAYRATE = 3575.65;
	private double overTimePay;
	
	public PartTimeEmployee() {
		
		super(); 
		this.overTimePay=0;
		}
	public PartTimeEmployee(String iD, String name, String phone, double salry, double hoursWorked) {
		super(iD,name, name, salry, hoursWorked);
	}
	@Override
	public double calculateOverTime() {
		
		overTimePay=( BASICPAYRATE + ((hoursWorked*6)* OVTRATE));
		return overTimePay;
	}

	@Override
	public double CalculatePay() {
		if (hoursWorked <=6) {
			return BASICPAYRATE *hoursWorked;
		}
		return salry = BASICPAYRATE *6 * OVTRATE;
	} 

}
