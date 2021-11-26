package lab7.shape;

import lab7.Visitor;

public interface Shape {
    String accept(Visitor visitor);
}