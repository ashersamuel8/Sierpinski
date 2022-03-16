/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {

	// WRITE YOUR CODE HERE
        double m[] = new double[array.length];
        for(int i = 0; i < array.length; i++)
        {
            m[i] = array[i];
        }
        return m;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
	
    // WRITE YOUR CODE HERE
        double x1[] = new double[x.length];
        double y1[] = new double[y.length];
        for(int i = 0; i < x.length; i++)
        {
            y1[i] = alpha*y[i];
            x1[i] = alpha*x[i];
            x[i] = x1[i];
            y[i] = y1[i];
        }
        
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {

	// WRITE YOUR CODE HERE
        double x2[] = new double[x.length];
        double y2[] = new double[y.length];
        for(int i = 0; i < x.length; i++)
        {
            y2[i] = dy + y[i];
            x2[i] = dx + x[i];
            x[i] = x2[i];
            y[i] = y2[i];
        }
        

    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {

	// WRITE YOUR CODE HERE
        double x3[] = new double[x.length];
        double y3[] = new double[y.length];
        for(int i = 0; i < x.length; i++)
        {
            x3[i] = x[i]*Math.cos(theta*Math.PI/180) - y[i]*Math.sin(theta*Math.PI/180);
            y3[i] = y[i]*Math.cos(theta*Math.PI/180) + x[i]*Math.sin(theta*Math.PI/180);
            x[i] = x3[i];
            y[i] = y3[i];
            
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);
        
        
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {

	// WRITE YOUR CODE HERE

        StdDraw.setScale(-5.0, +5.0); 
        double[] x = { 0, 1, 1, 0 }; 
        double[] y = { 0, 0, 2, 1 }; 
        double theta = 30.0; 
        double alpha = 2.0;
        double dx = 2, dy = 2;
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y); 
        rotate(x, y, theta);
        System.out.println(Math.sqrt(3)/2);
        
    }
}
