/**
 * 
 */
package cs361recursion;

/**
 * @author cscharff
 *
 */
public class Factorial {

	/**
	 * factorial function
	 * @param n  
	 * @return the factorial of n
	 * @throws IllegalArgumentException if n < 0 or n > 12. Factorial should not
	 * accept a negative number as an argument. For n > 12, factorial(n) is not an int anymore. 
	 */
	public static int factorial(int n) {
		if (n < 0 || n > 12) {
			throw new IllegalArgumentException("n should be between 0 and 12");
		} else {
		if (n==0) {
			return 1;
		} else {
			return n*factorial(n-1);
		}}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			System.out.println("Factorial(" + i + ") = " + factorial(i));
		}

	}

}
