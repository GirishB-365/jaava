public class new1 {
    
}
class Shape {
    int length;
    int breadth;
    int radius;
    
    Shape(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    Shape(int radius) {
        this.radius = radius;
    }
}

class Rectangle extends Shape {
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }
    
    void calculateArea() {
        int area = length * breadth;
        System.out.println("Area of rectangle: " + area);
    }
}

class Square extends Shape {
    Square(int side) {
        super(side, side); 
    }
    
    void calculateArea() {
        int area = length * length; 
        System.out.println("Area of square: " + area);
    }
}

class Circle extends Shape {
    Circle(int radius) {
        super(radius);
    }
    
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle: " + area);
    }
}

public class GeometryCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        rect.calculateArea();
        
        Square square = new Square(5);
        square.calculateArea();
        
        Circle circle = new Circle(7);
        circle.calculateArea();
    }
}