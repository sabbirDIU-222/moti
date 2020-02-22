
package abstraction;


public class Area {
    Circle circle;
    Rectangle rect;
    Triangle tri;

    public Area(Circle circle, Rectangle rect, Triangle tri) {
        this.circle = circle;
        this.rect = rect;
        this.tri = tri;
    }

    public Area(Circle circle, Rectangle rect) {
        this.circle = circle;
        this.rect = rect;
    }

    public Area(Circle circle, Triangle tri) {
        this.circle = circle;
        this.tri = tri;
    }

    public Area(Rectangle rect, Triangle tri) {
        this.rect = rect;
        this.tri = tri;
    }


    
    double area_Total(Circle circle, Rectangle rect, Triangle tri){
        return (circle.com_Area()+rect.com_Area()+tri.com_Area());
    }
    double area_Total(Circle circle, Rectangle rect){
        return (circle.com_Area()+rect.com_Area());
    }
    double area_Total(Circle circle,Triangle tri){
        return (circle.com_Area()+tri.com_Area());
    }
    double area_Total(Rectangle rect, Triangle tri){
        return (rect.com_Area()+tri.com_Area());
    }
    
}
