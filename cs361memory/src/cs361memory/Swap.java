/**
 * 
 */
package cs361memory;

/**
 * @author cscharff
 *
 */
public class Swap {

	/**
	 * The swap function that permits to test if a language uses parameter passing
	 * by value or reference. If the arguments are swapped, the language uses
	 * parameter passing by reference. Otherwise, it uses parameter passing by
	 * value. Java uses parameter passing by value. swap does NOT swap.
	 * 
	 * @param n
	 * @param m
	 * @return swap the parameters (but really does not in Java)
	 **/
	public static void swap(int n, int m) {
		int temp = n;
		n = m;
		m = temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a = 9, b = 5;
		System.out.println("Initial values - a = " + a + ", b = " + b);
		swap(a, b);
		System.out.println("After swap - a = " + a + ", b = " + b);
		System.out.println("So what is it? Parameter passing by value or reference?");
	}

}
