
package abstraction;

public class Triangle extends Polygon{
    double height,length;

    public Triangle(double height, double length, String color) {
        super(color);
        this.height = height;
        this.length = length;
    }

    
    @Override
    public double com_Area() {
       return 0.5 * height * length;
    }

    @Override
    public String toString() {
      return "Triangle color is " + super.color +  
                       " and area is : " + com_Area();  
    }
    
    
}
