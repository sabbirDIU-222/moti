
package abstraction;


public class Circle extends Shape{
    double radius; 
      
    public Circle(String color,double radius) { 
 
        super(color); 
        
        this.radius = radius; 
    } 

    
    @Override
    public double com_Area() { 
        return Math.PI * Math.pow(radius, 2); 
    } 
  
    @Override
    public String toString() { 
        return "Circle color is " + super.color +  
                       " and area is : " + com_Area(); 
    } 
}
