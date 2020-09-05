/**
 * 
 */
package employeesol;

/**
 * @author cscharff
 *
 */

// Resource: https://www.baeldung.com/java-type-casting

public class DemoEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Employee emp1 = new Employee("John", "Smith", "123456790");

		PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

//		Employee emp2 = new Employee("Don", "Holmes", "123456799");
		
//		PartTimeEmployee pEmp2 = new PartTimeEmployee("Melissa", "Will", "123456666", 23.5);

		// Upcasting
		Employee emp3 = pEmp1;
 		// Employee emp3 = (Employee)pEmp1;
		System.out.println("emp3");
		emp3.whoAmI(); // part time employee - method resolution is resolved at run time
		// emp3.getHourlyRate(); // syntax error - method resolution is resolved at run time

		if (emp3 instanceof Employee) {
			System.out.println("emp3 instance of employee"); // printed
		} else {
			System.out.println("emp3 not instance of employee");
		}

		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
		} else {
			System.out.println("emp3 not instance of part time employee");
		}

		// Downcasting 1
		// Requires the use of intanceof to avoid a run time cast exception
		// Ok at compile time
		// Exception ClassCastException at run time 
		// PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;

		// Downcasting 2		
		if (emp3 instanceof PartTimeEmployee) {
			System.out.println("emp3 instance of part time employee"); // printed
			PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; // cast required
			System.out.println(pEmp4.getHourlyRate());
		} else {
			System.out.println("emp3 not instance of part time employee");
		}
	}
}
