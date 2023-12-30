public class Teacherconsoverload {
    String name, gender;
    int phone;

    // Default Constructor
    Teacherconsoverload() {
        System.out.println("No value");
    }

    // Parameterized Constructor
    Teacherconsoverload(String n, String g) {
        name = n;
        gender = g;
    }

    Teacherconsoverload(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    // method
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Gender : " + gender);
        System.out.println("Phone  : " + phone);
    }

}