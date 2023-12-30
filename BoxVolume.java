import java.util.Scanner;

public class BoxVolume {
    double height, width, depth;

    BoxVolume(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    void display() {
        System.out.println("Volume = " + (height * width * depth));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        BoxVolume ob1;
        System.out.println("Enter the height, width, and depth of the box: ");
        double h = input.nextDouble();
        double w = input.nextDouble();
        double d = input.nextDouble();
        ob1 = new BoxVolume(h, w, d);
        ob1.display();

        BoxVolume ob2;
        System.out.println("Enter the height, width, and depth of the box: ");
        double h2 = input.nextDouble();
        double w2 = input.nextDouble();
        double d2 = input.nextDouble();
        ob2 = new BoxVolume(h2, w2, d2);
        ob2.display();

        input.close();
    }
}
