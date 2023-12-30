public class instancevarhiding {
    double height, width, depth;

    instancevarhiding(double height, double width, double depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    void display() {
        double vol = height * width * depth;
        System.out.println("Volume of the box is " + vol);
    }

    public static void main(String[] args) {
        instancevarhiding ob1 = new instancevarhiding(10, 10, 10);
        ob1.display();
        instancevarhiding ob2 = new instancevarhiding(10.2, 11.6, 20.36);
        ob2.display();
    }
}