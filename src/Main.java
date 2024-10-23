// Main class demonstrating polymorphism and SOLID principles.
public class Main {
    public static void main(String[] args) {

        // Liskov Substitution Principle (LSP): We can substitute Circle and Rectangle objects 
        // where Shape is expected, demonstrating LSP in action.
        Shape circle = new Circle("Red", 5.0);
        Shape rectangle = new Rectangle("Blue", 4.0, 4.0);

        // Dependency Inversion Principle (DIP): Main depends on abstractions (Shape, AreaCalculable, 
        // and PerimeterCalculable) rather than concrete implementations (Circle, Rectangle), 
        // allowing for easy extension.
        System.out.println(circle.getDescription());
        System.out.println("Circle Area: " + ((AreaCalculable)circle).calculateArea());
        System.out.println("Circle Perimeter: " + ((PerimeterCalculable)circle).calculatePerimeter());
        System.out.println();
        
        System.out.println(rectangle.getDescription());
        System.out.println("Rectangle Area: " + ((AreaCalculable)rectangle).calculateArea());
        System.out.println("Rectangle Perimeter: " + ((PerimeterCalculable)rectangle).calculatePerimeter());
        System.out.println();

        // Polymorphism (Compile-time): This demonstrates method overloading for Circle.
        Circle specificCircle = (Circle) circle;
        System.out.println("Circle scaled perimeter (scale=2): " + specificCircle.calculatePerimeter(2.0));

        // Polymorphism (Compile-time): This demonstrates method overloading for Rectangle.
        Rectangle specificRectangle = (Rectangle) rectangle;
        System.out.println("Rectangle perimeter with square check: " + specificRectangle.calculatePerimeter(true));
    }
}
