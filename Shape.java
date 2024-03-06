// New Task Write a Java program to create an interface Shape with the getArea() method.
//  Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. 
// Implement the getArea() method for each of the three classes. created


/**
 * Shape
 */
public interface Shape {
public void getArea();

    
}
class Rectangle implements Shape{
    private float length;
    private float breadth;
    
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public void getArea(){
        System.out.println("area of rectangle:"+""+length*breadth);
    }
}
class Circle implements Shape{
    private float radious;
    public Circle(float radious){
        this.radious=radious;

    }
    public void getArea(){
        System.out.println("area of crcle:"+Math.PI*radious*radious);
    }

}
class Triangle implements Shape{
    private float b;
    private float h;
    public Triangle(float b,float h){
        this.b=b;
        this.h=h;

    }
    public void getArea(){
        System.out.println("area of triangle:"+0.5*b*h);
    }
}

class test4{
    public static void main(String[] args) {
        Rectangle r1=new Rectangle(4,5);
        r1.getArea();
        Circle c1=new Circle(7);
        c1.getArea();
        Triangle t1=new Triangle(5,6);
        t1.getArea();
    }
}

