package shapes;

public class ShapeManager {
    public static void main(String[] args) {

        Shape circle = new Circle("Circle", 5.0);
        Shape rectangle = new Rectangle("Rectangle", 3.0, 4.0);

        ((Drawable) circle).draw();
        circle.display();

        ((Drawable) rectangle).draw();
        rectangle.display();
    }
}
