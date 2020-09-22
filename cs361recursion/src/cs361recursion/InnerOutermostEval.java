/**
 * 
 */
package cs361recursion;

/**
 * @author cscharff
 *
 */
public class InnerOutermostEval {

	/**
	 * This f function that permits to test if the evaluation of recursive functions uses
	 * the innermost or outermost evaluation strategy. If the evaluation of f(1,1) terminates, 
	 * the language uses outermost evaluation, otherwise, it uses innermost evaluation.
	 * Java uses innermost evaluation of recursive functions.
	 * 
	 * @param n
	 * @param m
	 * @return evaluation f
	 **/
	public static int f(int n, int m) {
		if (n == 0) {
			return 0;
		} else {
			return f(n - 1, f(n, m));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("So what is it? Innermost or outermost evaluation?");
		System.out.println("f(1,1) = " + f(1,1));

	}

}
