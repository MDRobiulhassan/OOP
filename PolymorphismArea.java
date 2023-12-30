public class PolymorphismArea {
    public class Shape {
        double a, b, area = 0;

        void Area() {
            System.out.println("The area of the Shape is " + area);
        }
    }

    public class Rectangle extends Shape {
        Rectangle(double length, double width) {
            a = length;
            b = width;
        }

        @Override
        void Area() {
            System.out.println("The area of the Rectangle is " + (a * b));
        }
    }

    public class Triangle extends Shape {
        Triangle(double base, double height) {
            a = base;
            b = height;
        }

        @Override
        void Area() {
            System.out.println("The area of the Triangle is " + (a * b) * .5);
        }
    }

    public static void main(String[] args) {
        PolymorphismArea pl = new PolymorphismArea();

        Shape[] s = new Shape[3];
        s[0] = pl.new Shape();
        s[1] = pl.new Rectangle(4, 6);
        s[2] = pl.new Triangle(7, 8);

        for (int i = 0; i < 3; i++) {
            s[i].Area();
        }

    }
}
