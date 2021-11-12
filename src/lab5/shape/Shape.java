package lab5.shape;

abstract public class Shape {
    String color;

    // metode abstracte
    public abstract double area();
    public abstract String toString();

     // clasa abstracta poate avea un constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }

    // metoda concreta
    public String getColor() { return color; }
}
