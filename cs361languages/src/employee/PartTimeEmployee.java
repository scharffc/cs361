/**
 * 
 */
package employee;

/**
 * @author cscharff
 *
 */
public class PartTimeEmployee extends Employee {

	private double hourlyRate;
	
	public PartTimeEmployee(String fname, String lname, String ssn, double hourlyRate) {
		super(fname, lname, ssn);
		this.hourlyRate = hourlyRate;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getContractType() {
		return "Contract";
	}
	
	public void whoAmI() {
		System.out.println("PART TIME EMPLOYEE");
	}
}
