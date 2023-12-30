public class FinalMethod {
    public class University {
        final void display() {
            System.out.println("University Info");
        }
    }

    public class Student extends University {
        void display2() {
            System.out.println("Student Info");
        }
    }

    public static void main(String[] args) {
        FinalMethod f = new FinalMethod();
        Student s = f.new Student();
        s.display();
        s.display2();
    }
}