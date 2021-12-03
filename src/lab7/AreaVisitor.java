package lab7;

import lab7.shape.Circle;
import lab7.shape.Dot;
import lab7.shape.Rectangle;

public class AreaVisitor implements Visitor{
    @Override
    public String visit(Dot dot) {
        return "0";
    }

    @Override
    public String visit(Circle circle) {
        float aria = (float) (3.14 * circle.getRadius() * circle.getRadius());
        return Float.toString(aria);
    }

    @Override
    public String visit(Rectangle rectangle) {
        float aria = (float) (rectangle.getHeight() * rectangle.getWidth());
        return Float.toString(aria);
    }
}
