/**
 * 
 */
package mystack;

/**
 * @author cscharff
 *
 */
public class Person {
	
	private String fname, lname;
	
	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}	

	/**
	 * 
	 */
	public Person() {
	}
	


	/**
	 * @param fname
	 * @param lname
	 */
	public Person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}

}
