
package abstraction;

public class Test {
    public static void main(String[] args) {
        Shape ob1=new Circle("red",5.4);
        Shape ob2=new Triangle(2.5,3.5,"red");
        Shape ob3=new Rectangle(4.0,5.0,"red");
        Circle or1=new Circle("red",5.4);
        Triangle or2=new Triangle(2.5,3.5,"red");
        Rectangle or3=new Rectangle(4.0,5.0,"red");
        
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
        
       Area ob4=new Area(or1,or3,or2);
        System.out.println(ob4.area_Total(or1, or3, or2));
       
    }
}
