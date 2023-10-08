package Tugas1;
public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;
    private String color;

    // Constructors
    /** Constructs a Circle instance with default value for radius and color */
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }

    public Circle(double radius) { // 2nd constructor
        this.radius = radius;
        color = "red";
    }

    /** Constructs a Circle instance with the given radius and color */
    public Circle(double radius, String color) { // 2nd constructor
        this.radius = radius;
        this.color = color;
    }

    /** Returns the color */
    public String getColor() {
        return color;
    }

    /** Sets the color */
    public void setColor(String color) {
        this.color = color;
    }

    /** Returns the radius */
    public double getRadius() {
        return radius;
    }

    /** Returns the area of this Circle instance */

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}