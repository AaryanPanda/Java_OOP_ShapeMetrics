// Inheritance: The Circle class inherits from the Shape class, allowing it to reuse 
// the common attributes and methods defined in Shape (like color and name).
public class Circle extends Shape implements AreaCalculable, PerimeterCalculable {
    
    // Encapsulation: The 'radius' field is encapsulated and accessible only through getters and setters.
    private double radius;

    // OCP: Open-Closed Principle is demonstrated as we extend the Shape class without modifying it, 
    // adding new functionality specific to Circle.
    public Circle(String color, double radius) {
        super("Circle", color);  // Reusing the parent class's constructor via inheritance.
        this.radius = radius;
    }

    // Polymorphism (Run-time): Circle provides its own implementation of the calculateArea method 
    // defined in the AreaCalculable interface, achieving method overriding (run-time polymorphism).
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Polymorphism (Run-time): The calculatePerimeter method is also overridden here to provide specific 
    // functionality for Circle, which differs from other shapes.
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // Polymorphism (Compile-time): This method demonstrates compile-time polymorphism (method overloading),
    // as it allows calculating perimeter with a scaling factor.
    public double calculatePerimeter(double scalingFactor) {
        return 2 * Math.PI * radius * scalingFactor;
    }

    // Encapsulation: Getter and setter methods control access to the radius field.
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
