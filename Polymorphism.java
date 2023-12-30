public class Polymorphism {
    public class Person {
        void display() {
            System.err.println("I am a Person");
        }
    }

    public class Teacher extends Person {
        @Override
        void display() {
            System.err.println("I am a Teacher");
        }
    }

    public class Student extends Person {
        @Override
        void display() {
            System.err.println("I am a Student");
        }
    }

    public static void main(String[] args) {
        Polymorphism pl = new Polymorphism();
        Person p = pl.new Person();
        p.display();
        p = pl.new Teacher();
        p.display();
        p = pl.new Student();
        p.display();
    }
}