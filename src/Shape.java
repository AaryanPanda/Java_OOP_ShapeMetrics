// Abstraction: Shape is an abstract class representing the common characteristics of shapes,
// hiding the complexity of different shapes by providing a common interface (abstraction).
public abstract class Shape {

    // Encapsulation: The fields 'color' and 'name' are encapsulated within the class, 
    // and access is controlled via getters and setters, restricting external modification.
    protected String color;
    private String name;

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getDescription() {
        return String.format("This is a %s %s", color, name);
    }

    public String getColor() {
        return color;
    }
    
    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }
}
