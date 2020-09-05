/**
 * 
 */
package circle;

/**
 * @author cscharff
 *
 */
public class DemoCircleSimple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Circle c = new Circle();
		ColoredCircle cc = new ColoredCircle();
		
		c.draw(); 	// Drawing a Circle... 
					// draw method from Cicle
		
		// Upcasting
		c = cc; 
		
		c.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		cc.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time

	}

}
