/**
 * 
 */
package circlesol;

/**
 * @author cscharff
 *
 */
public class DemoCircle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Circle c = new Circle();
		c.centerX = 5.0;
		c.centerY = 5.0;	
		c.radius = 5.0;
		
		ColoredCircle cc = new ColoredCircle();
		cc.centerX = 6.0;
		cc.centerY = 6.0;

		System.out.println("c - x = " + c.centerX + " y = " + c.centerY );
		System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY );
		
		c.draw(); 	// Drawing a Circle... 
					// draw method from Circle
		
		// Upcasting
		c = cc; 
		
		System.out.println("c: Circle = cc: ColoredCircle"); 

		System.out.println("c - x = " + c.centerX + " y = " + c.centerY );
		c.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time
		
		System.out.println("cc - x = " + cc.centerX + " y = " + cc.centerY );
		cc.draw(); 	// Drawing a ColoredCircle...
					// draw method from ColoredCircle
					// method resolution at run time

		Circle c1 = new Circle();
		c1.centerX = 6.0;
		c1.centerY = 6.0;
		c1.radius = 6.0;
		
		Circle c2 = new Circle();
		c2.centerX = 6.0;
		c2.centerY = 6.0;
		c2.radius = 6.0;
		
		System.out.println("c1: " + c1.toString());
		System.out.println("c2: " + c2.toString());
				
		System.out.println("c1.equals(c2)");
		System.out.println(c1.equals(c2));
		
		Circle c3;
		try {
			System.out.println("c1 is a copy of c3");
			c3 = (Circle) c1.clone();
			System.out.println("c1.equals(c3)");
			System.out.println(c1.equals(c3));
			System.out.println("c1 == c3");
			System.out.println(c1 == c3);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
