package lab7;

import lab7.shape.Circle;
import lab7.shape.Dot;
import lab7.shape.Rectangle;
import lab7.shape.Shape;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        Dot dot = new Dot(10, 55);
        Circle circle = new Circle(3, 15, 10);
        Rectangle rectangle = new Rectangle(10, 17, 20, 30);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(dot);
        shapes.add(circle);
        shapes.add(rectangle);

        DrawingVisitor visitor = new DrawingVisitor();
        AreaVisitor areVisitor = new AreaVisitor();


        for (Shape s: shapes) {
            System.out.println(s.accept(visitor));
            System.out.println(s.accept(areVisitor));
        }
    }
}
