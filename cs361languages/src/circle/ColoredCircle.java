/**
 * 
 */
package circle;

/**
 * @author cscharff
 *
 */
public class ColoredCircle extends Circle {

	public int color;
	
	/**
	 * 
	 */
	public ColoredCircle() {
	}

	@Override
	void moveTo(int newX, int newY) {
	}
	
	// overridden method from Circle
	@Override
	void draw() {
		System.out.println("Drawing a ColoredCircle...");
	}
}
