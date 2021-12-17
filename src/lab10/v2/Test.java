package lab10.v2;

public class Test {
    public static void main(String[] args) {
        Image image = new Image(128, 128);
        Editor editor = new Editor();

        BlurCommand blur = new BlurCommand(image, 10);
        ResizeCommand resize = new ResizeCommand(image, 64, 64);

        editor.edit(blur);
        System.out.println(image.getBlurStrength());
        editor.edit(resize);
        System.out.println(image.getWidth());
        editor.undo();
        System.out.println(image.getWidth());
        editor.undo();
        System.out.println(image.getBlurStrength());
    }
}
