/**
 * 
 */
package employee;

/**
 * @author cscharff
 *
 */
public class Employee {
	
	private String fname, lname, ssn;

	/**
	 * @param fname
	 * @param lname
	 * @param ssn
	 */
	public Employee(String fname, String lname, String ssn) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void whoAmI() {
		System.out.println("EMPLOYEE");
	}

}

