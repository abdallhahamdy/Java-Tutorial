package AbstractKeywordShapesExample;

public class AbstractKeywordShapesExample {
    public static void main(String[] args) {
        final DrawObject circle = new Circle(10, 20);
        final DrawObject line = new Line(10, 20);
        final DrawObject rectangle = new Rectangle(10, 20);
        circle.draw();
        line.draw();
        rectangle.draw();
    }
}

abstract class DrawObject {
    int x, y;

    public DrawObject(final int x, final int y) {
        super();
        this.x = x;
        this.y = y;
    }

    void moveTo(final int newX, final int newY) {
        System.out.println(" move GraphicObject points :: " + newX + " " + newY);
    }

    abstract void draw();

    abstract void resize();
}

class Rectangle extends DrawObject {

    public Rectangle(final int x, final int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw Rectangle");
    }

    @Override
    void resize() {
        // TODO Auto-generated method stub
    }

}

class Line extends DrawObject {

    public Line(final int x, final int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw Line");
    }

    @Override
    void resize() {

    }
}

class Circle extends DrawObject {

    public Circle(final int x, final int y) {
        super(x, y);
    }

    @Override
    void draw() {
        System.out.println("Draw Circle");
    }

    @Override
    void resize() {

    }
}