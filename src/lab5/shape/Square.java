package lab5.shape;

public class Square extends Shape {
    double length;

    public Square(String color, double length) {
        super(color);
        this.length = length;
    }


    @Override
    public double area() {
        return length * length;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + super.getColor()
                + "and area is : " + area();
    }
}
