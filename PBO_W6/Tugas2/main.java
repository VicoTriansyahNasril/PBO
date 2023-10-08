package Tugas2;

public class main {
    public static void main(String[] args) {
        // Membuat objek-objek dari kelas Circle, Rectangle, dan Square
        Circle circle = new Circle(5.0, "blue", true);
        Rectangle rectangle = new Rectangle(4.0, 6.0, "red", false);
        Square square = new Square(4.0, "green", true);

        // Menampilkan informasi mengenai objek-objek yang telah dibuat
        System.out.println("Circle:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println(circle.toString());

        System.out.println("\nRectangle:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Filled: " + rectangle.isFilled());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString());

        System.out.println("\nSquare:");
        System.out.println("Color: " + square.getColor());
        System.out.println("Filled: " + square.isFilled());
        System.out.println("Side: " + square.getSide());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println(square.toString());
    }
}
