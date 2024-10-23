// Inheritance: The Rectangle class inherits from the Shape class, just like Circle, 
// to reuse common properties and methods.
public class Rectangle extends Shape implements AreaCalculable, PerimeterCalculable {

    // Encapsulation: Fields 'length' and 'width' are encapsulated and accessed via getters and setters.
    private double length;
    private double width;

    // OCP: The Shape class is extended without modification to add new behavior specific to Rectangle.
    public Rectangle(String color, double length, double width) {
        super("Rectangle", color);  // Inheriting the color and name properties from Shape.
        this.length = length;
        this.width = width;
    }

    // Polymorphism (Run-time): Rectangle provides its own implementation of the calculateArea method,
    // overriding the behavior defined in the AreaCalculable interface.
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Polymorphism (Run-time): Similarly, calculatePerimeter is overridden to handle rectangle-specific behavior.
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    // Polymorphism (Compile-time): Overloaded version of calculatePerimeter that adds an optional 
    // check for square, demonstrating method overloading (compile-time polymorphism).
    public double calculatePerimeter(boolean isSquareCheck) {
        if (isSquareCheck && isSquare()) {
            return 4 * length;
        }
        return calculatePerimeter();
    }

    // Encapsulation: Getter and setter methods for the 'length' and 'width' fields.
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    // Additional logic to determine if the rectangle is a square.
    public boolean isSquare() {
        return length == width;
    }
}
