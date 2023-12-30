public class Teachercons {
    String name;
    String gender;
    int phone;

    //Default Constructor
    Teachercons(){
        System.out.println("No value");
    }

    // Parameterised Constructor
    Teachercons(String n, String g, int p) {
        name = n;
        gender = g;
        phone = p;
    }

    // Method
    void display() {
        System.err.println("Name   : " + name);
        System.err.println("Gender : " + gender);
        System.err.println("Phone  : " + phone);
    }
}
