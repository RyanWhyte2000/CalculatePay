package driver;
import domain.Payable;
import domain.PartTimeEmployee;
import domain.Employee;
public class Driver {

	public static void main(String[] args) {
		
		Payable payee = new PartTimeEmployee("1234", "John Brown", "1234567",6500.89,7.3 );
		
		final double overtime = payee.calculateOverTime();
		
		System.out.println("Overtime is " +overtime); 
		
		
		Employee emp =(Employee)payee;
		
		double salary= emp.CalculatePay();
		
		System.out.println("Pay is " +salary); 

	}

}
