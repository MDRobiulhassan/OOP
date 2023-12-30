public class ThisKeyword {
    public class Person {
        String name;
        int age;
        String hairColour;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Person(String name, int age, String hairColour) {
            this(name, age);
            this.hairColour = hairColour;
        }

        void display() {
            System.out.println("Name:        " + name);
            System.out.println("Age:         " + age);
            System.out.println("Hair Colour: " + hairColour);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ThisKeyword t = new ThisKeyword();
        Person p1 = t.new Person("Robiul", 23, "Black");
        p1.display();

        Person p2 = t.new Person("Hassan", 49);
        p2.display();
    }

}