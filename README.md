# **OOP and SOLID Principles: Shape Calculator**

## **Project Overview**
This project demonstrates the core concepts of **Object-Oriented Programming (OOP)** and **SOLID principles**. It calculates the **area** and **perimeter** for shapes like Circles and Rectangles, showcasing clean, scalable design.

---

## **Key Concepts**

### **OOP Principles**
- **Encapsulation**: Hides internal data using getters/setters.
- **Abstraction**: Common interfaces for shapes through the `Shape` class.
- **Inheritance**: Shapes like `Circle` and `Rectangle` extend the base `Shape` class.
- **Polymorphism**: Different implementations of methods like `calculateArea` in each shape (runtime) and method overloading (compile-time).

### **SOLID Principles**
- **SRP**: Each class handles a specific shape.
- **OCP**: Easily extendable for new shapes without modifying existing code.
- **LSP**: Subclasses like `Circle` and `Rectangle` can replace `Shape` without issues.
- **ISP**: Separate interfaces for calculating area and perimeter.
- **DIP**: High-level modules depend on abstractions (interfaces).

---

## **File Structure**
```plaintext
└── src
    ├── AreaCalculable.java       # Interface for area calculation
    ├── PerimeterCalculable.java  # Interface for perimeter calculation
    ├── Shape.java                # Abstract base class
    ├── Circle.java               # Circle implementation
    ├── Rectangle.java            # Rectangle implementation
    └── Main.java                 # Runs the program
