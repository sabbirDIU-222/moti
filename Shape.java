
package abstraction;

abstract class Shape {
    String color;
    
     public Shape(String color) { 
       
        this.color = color; 
     }
    
public abstract double com_Area();

public abstract String toString();

}
