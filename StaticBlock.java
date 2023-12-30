public class StaticBlock {
    static int id;
    static String name;

    static {
        id = 1043;
        name = "Robiul";
        System.out.println("Static Block");
    }

    static void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        StaticBlock.display();
    }
}
