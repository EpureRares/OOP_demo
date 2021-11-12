package lab5.shape;

public class Main {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Square("Yellow", 2);
        // Shape s3 = new Shape(); -- eroare pentru ca o clasa abstracta nu poate fi instantiata

        System.out.println(s1);
        System.out.println(s2);
    }
}
