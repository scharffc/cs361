// File: Location.java from the package edu.colorado.geometry
// Additional javadoc documentation is available from the Location link in:
// http://www.cs.colorado.edu/~main/docs

package edu.colrado.geometry;

/******************************************************************************
* A Location object keeps track of a location on a two-dimensional
* plane.
*
* @see
*   <A HREF="../../../../edu/colorado/geometry/Location.java">
*   Java Source Code for this class
*   (www.cs.colorado.edu/~main/edu/colorado/geometry/Location.java)
*   </A>
*
* @author Michael Main 
*   <A HREF="mailto:main@colorado.edu"> (main@colorado.edu) </A>
*
* @version Feb 10, 2016
******************************************************************************/
public class Location implements Cloneable
{
   private double x; // The x coordinate of this Location
   private double y; // The y coordinate of this Location

   /**
   * Construct a Location with specified coordinates.
   * @param xInitial
   *   the initial x coordinate of this Location
   * @param yInitial
   *   the initial y coordinate of this Location
   * @postcondition
   *   This Location has been initialized at the given coordinates.
   **/   
   public Location(double xInitial, double yInitial)
   {
      x = xInitial;
      y = yInitial;
   }
   
   
   /**
   * Generate a copy of this Location.
   * @return
   *   The return value is a copy of this Location. Subsequent
   *   changes to the copy  will not affect the original, nor vice versa. 
   *   Note that the return value is a Location (not a plain Object)
   *   which is permitted with Java 5.0.
   **/ 
   public Location clone( )
   {  // Clone a Location object.
      Location answer;
      
      try
      {
         answer = (Location) super.clone( );
      }
      catch (CloneNotSupportedException e)
      {  // This exception should not occur. But if it does, it would probably
         // indicate a programming error that made super.clone unavailable.
         // The most common error would be forgetting the "Implements Cloneable"
         // clause at the start of this class.
         throw new RuntimeException
            ("This class does not implement Cloneable.");
      }
      
      return answer;
   }
   

   /**
   * Compute the distance between two Locations.
   * @param p1
   *   the first Location
   * @param p2
   *   the second Location
   * @return
   *   the distance between p1 and p2
   * @note
   *   The answer is Double.POSITIVE_INFINITY if the distance
   *   calculation overflows. The answer is Double.NaN if either
   *   Location is null.
   **/
   public static double distance(Location p1, Location p2)
   {
      double a, b, c_squared;

      // Check whether one of the locations is null.
      if ((p1 == null)  ||  (p2 == null))
         return Double.NaN;
               
      // Calculate differences in x and y coordinates.
      a = p1.x - p2.x;
      b = p1.y - p2.y;
      
      // Use Pythagorean Theorem to calculate the square of the distance.
      // between the locations.
      c_squared = a*a + b*b;
      
      return Math.sqrt(c_squared);
   } 
   
     
   /**
   * Compare this Location to another object for equality.
   * @param obj
   *   an object with which this Location will be compared
   * @return
   *   A return value of true indicates that 
   *   obj refers to a 
   *   Location object with the same value as this 
   *   Location. Otherwise the return value is 
   *   false.
   * @note
   *   If obj is null or does not refer to a 
   *   Location object, then the answer is 
   *   false.
   **/   
   public boolean equals(Object obj)
   {
      if (obj instanceof Location)
      {
         Location candidate = (Location) obj;
         return (candidate.x == x) && (candidate.y == y);
      }
      else
         return false;
   }
   
   
   /**
   * Get the x coordinate of this Location.
   * @return
   *   the x coordinate of this Location.
   **/ 
   public double getX( )
   {
      return x;
   }
   
   
   /**
   * Get the y coordinate of this Location.
   * @return
   *   the y coordinate of this Location.
   **/ 
   public double getY( )
   {
      return y;
   }
   

   /**
   * Generate and return a Location halfway between two others.
   * @param p1
   *   the first Location
   * @param p2
   *   the second Location
   * @return
   *   a Location that is halfway between p1
   *   and p2.
   * @note
   *   The answer is null if either p1 or p2 is null.
   **/
   public static Location midpoint(Location p1, Location p2)
   {
      double xMid, yMid;
      
      //Check whether one of the locations is null.
      if ((p1 == null)  ||  (p2 == null))
         return null;
      
      // Compute the x and y midpoints.
      xMid = (p1.x/2) + (p2.x/2);
      yMid = (p1.y/2) + (p2.y/2);
      
      // Create a new location and return it.
      Location answer = new Location(xMid, yMid);       
      return answer;
   }
   
   
   /**
   * Rotate this Location 90 degrees in a clockwise direction.
   * @postcondition
   *   This Location has been rotated clockwise 90 degrees around
   *   the origin.
   **/
   public void rotate90( )
   {
      double xNew;
      double yNew;
      
      // For a 90 degree clockwise rotations, the new x is the original y
      // and the new y is -1 times the original x.
      xNew = y;
      yNew = -x;
      x = xNew;
      y = yNew;
   }
   
   
   /**
   * Move this Location by given amounts along the x and y axes.
   * @param xAmount
   *   the amount to move this Location along the x axis
   * @param yAmount
   *   the amount to move this Location along the y axis
   * @postcondition
   *   This Location has been moved by the given amounts along the two axes.
   * @note
   *   The shift may cause a coordinate to go above 
   *   Double.MAX_VALUE or below the minimum double value.
   *   In these cases, subsequent activations of getX or 
   *   getY will return Double.POSITIVE_INFINITY or 
   *   Double.NEGATIVE_INFINITY.
   **/ 
   public void shift(double xAmount, double yAmount)
   {
      x += xAmount;
      y += yAmount;
   }              
   
   
   /**
   * Generate a String representation of this Location.
   * @return
   *   a String representation of this Location
   **/
   public String toString( )
   {
       return "(x=" + x + "  y=" + y + ")";
   }
      
}
           
