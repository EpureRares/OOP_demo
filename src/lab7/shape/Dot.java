package lab7.shape;

import lab7.Visitor;

public class Dot implements Shape {
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visit(this);
    }
}
