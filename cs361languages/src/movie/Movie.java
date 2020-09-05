/**
 * 
 */
package movie;

/**
 * @author cscharff
 *
 */
public class Movie {

	// Instance variables
	// No encapsulation
	public int script, acting, directing;

	// Class variable
	public static int weightscript = 6;

	// Static method
	public static int rating(Movie m) {
		return m.script * weightscript + m.acting + m.directing;
	}

	// Instance method
	public int rating() {
		return script * weightscript + acting + directing;
	}
}