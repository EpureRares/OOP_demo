package lab7;

import lab7.shape.Circle;
import lab7.shape.Dot;
import lab7.shape.Rectangle;

public interface Visitor {
    String visit(Dot dot);

    String visit(Circle circle);

    String visit(Rectangle rectangle);
}
