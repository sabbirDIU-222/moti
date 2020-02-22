
package abstraction;


public abstract class Polygon extends Shape{

    public Polygon(String color) {
        super(color);
    }


  
    @Override
    public abstract double com_Area();

    @Override
    public abstract String toString() ;
    
    
}
