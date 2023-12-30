public class AbstractExample {
    abstract class Shape {
        double a, b;

        Shape(double a, double b) {
            this.a = a;
            this.b = b;
        }

        abstract void Area();
    }

    class Rectangle extends Shape {
        Rectangle(double length, double width) {
            super(length, width);
        }

        @Override
        void Area() {
            System.out.println("Area of Rectangle is " + (a * b));
        }
    }

    class Triangle extends Shape {
        Triangle(double base, double height) {
            super(base, base);
        }

        @Override
        void Area() {
            System.out.println("Area of rectangle is " + a * b * 0.5);
        }
    }

    class Circle extends Shape {
        Circle(double radius) {
            super(radius, radius);
        }

        @Override
        void Area() {
            System.out.println("Area of rectangle is " + 3.1416 * a * a);
        }
    }

    public static void main(String[] args) {
        AbstractExample a = new AbstractExample();
        Shape s = a.new Rectangle(10, 10);
        s.Area();
        s = a.new Triangle(10, 10);
        s.Area();
        s = a.new Circle(10);
        s.Area();
    }
}
