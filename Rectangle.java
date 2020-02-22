
package abstraction;

public class Rectangle extends Polygon{
    double width,height;

    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    

    @Override
    public double com_Area() {
       return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.color +  
                       " and area is : " + com_Area();
    }
    
    
}
