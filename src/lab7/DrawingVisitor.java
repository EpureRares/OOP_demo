package lab7;

import lab7.shape.Circle;
import lab7.shape.Dot;
import lab7.shape.Rectangle;

public class DrawingVisitor implements Visitor{
    @Override
    public String visit(Dot dot) {
        return "Drawing a dot";
    }

    @Override
    public String visit(Circle circle) {
        return "Drawing a circle";
    }

    @Override
    public String visit(Rectangle rectangle) {
        return "Drawing a rectangle";
    }
}
