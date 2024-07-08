package OpenClosedPrinciple.ViolationOfOCP;

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.getRadius() * circle.getRadius();
        } else if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.getWidth() * rectangle.getHeight();
        }
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 5);

        AreaCalculator calculator = new AreaCalculator();
        System.out.println("Circle area: " + calculator.calculateArea(circle)); // Output: Circle area: 78.5398
        System.out.println("Rectangle area: " + calculator.calculateArea(rectangle)); // Output: Rectangle area: 20.0
    }

}
